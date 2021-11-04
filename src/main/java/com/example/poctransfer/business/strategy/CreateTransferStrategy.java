package com.example.poctransfer.business.strategy;

import com.example.poctransfer.business.domain.TransferBO;
import com.example.poctransfer.business.domain.ExternalTransferDataBO;
import com.example.poctransfer.business.gateway.MetricGateway;
import com.example.poctransfer.business.usecase.GetPersonAndAccountUseCase;
import com.example.poctransfer.ports.TransferEntityPort;

import java.math.BigInteger;
import java.util.Map;

public abstract class CreateTransferStrategy {

    private final GetPersonAndAccountUseCase getPersonAndAccountUseCase;
    private final TransferEntityPort transferEntityPort;
    private final MetricGateway metricGateway;

    public CreateTransferStrategy(GetPersonAndAccountUseCase getPersonAndAccountUseCase, TransferEntityPort transferEntityPort, MetricGateway metricGateway) {
        this.getPersonAndAccountUseCase = getPersonAndAccountUseCase;
        this.transferEntityPort = transferEntityPort;
        this.metricGateway = metricGateway;
    }

    public TransferBO execute(TransferBO transferBO) {
        BigInteger id;
        try {
            transferBO
                    .addParticipantsAdditionalInfo(getPersonAndAccountUseCase.execute(transferBO.getIssuer().getPersonAccountSearchBO()),
                            getPersonAndAccountUseCase.execute(transferBO.getBeneficiary().getPersonAccountSearchBO()));
            ExternalTransferDataBO externalTransferDataBO = process(transferBO);
            transferBO.completeWithExternalData(externalTransferDataBO);
        } catch (RuntimeException e) {
            transferBO.setError("ERROR_TYPE");
        } finally {
            id = transferEntityPort.insert(transferBO);
            metricGateway.incrementCounter("", Map.of());
        }
        return transferBO;
    }

    protected abstract ExternalTransferDataBO process(TransferBO transferBO);
}
