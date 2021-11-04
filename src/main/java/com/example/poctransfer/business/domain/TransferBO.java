package com.example.poctransfer.business.domain;

import com.example.poctransfer.business.domain.participant.BeneficiaryBO;
import com.example.poctransfer.business.domain.participant.IssuerBO;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TransferBO {

    private String operationType;
    private IssuerBO issuer;
    private BeneficiaryBO beneficiary;
    private BigDecimal amount;
    private String currency;
    private String concept;
    private AdditionalDataBO additionalDataBO;

    public String getOperationType() {
        return operationType;
    }

    public IssuerBO getIssuer() {
        return issuer;
    }

    public BeneficiaryBO getBeneficiary() {
        return beneficiary;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public String getConcept() {
        return concept;
    }

    public AdditionalDataBO getAdditionalDataBO() {
        return additionalDataBO;
    }

    public void completeWithExternalData(ExternalTransferDataBO externalTransferDataBO) {
    }

    public void setError(String errorType) {

    }

    public void addParticipantsAdditionalInfo(PersonAccountBO issuer, PersonAccountBO beneficiary) {
        this.issuer.addAdditionalInfo(issuer);
        this.beneficiary.addAdditionalInfo(beneficiary);
    }

}
