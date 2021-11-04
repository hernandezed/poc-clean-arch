package com.example.poctransfer.ports.db.impl;

import com.example.poctransfer.business.domain.TransferBO;
import com.example.poctransfer.ports.TransferEntityPort;
import com.example.poctransfer.ports.db.mappers.TransferBoToTransferMapper;
import com.example.poctransfer.data_access.repositories.TransferRepository;
import org.springframework.stereotype.Component;

import java.math.BigInteger;

@Component
public class TransferEntityPortImpl implements TransferEntityPort {

    private final TransferRepository transferRepository;
    private final TransferBoToTransferMapper mapper;

    public TransferEntityPortImpl(TransferRepository transferRepository, TransferBoToTransferMapper mapper) {
        this.transferRepository = transferRepository;
        this.mapper = mapper;
    }

    @Override
    public BigInteger insert(TransferBO bo) {
        return transferRepository.save(mapper.map(bo)).getId();
    }
}
