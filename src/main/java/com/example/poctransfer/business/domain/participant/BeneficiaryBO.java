package com.example.poctransfer.business.domain.participant;

import com.example.poctransfer.business.domain.BeneficiaryType;
import com.example.poctransfer.business.domain.PersonAccountSearchBO;


public class BeneficiaryBO extends ParticipantBO {
    private BeneficiaryType type;
    private String value;
    private String taxPayerId;
    private String bankCode;
    private String accountDescription;

    public BeneficiaryBO(BeneficiaryType type, String value, String taxPayerId, String bankCode, String accountDescription) {
        this.type = type;
        this.value = value;
        this.taxPayerId = taxPayerId;
        this.bankCode = bankCode;
        this.accountDescription = accountDescription;
    }

    @Override
    public PersonAccountSearchBO getPersonAccountSearchBO() {
        return null;
    }
}
