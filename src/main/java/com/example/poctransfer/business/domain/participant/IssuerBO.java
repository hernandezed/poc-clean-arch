package com.example.poctransfer.business.domain.participant;

public class IssuerBO extends ParticipantBO {
    private String accountId;
    private String taxPayerId;

    public String getAccountId() {
        return accountId;
    }

    public String getTaxPayerId() {
        return taxPayerId;
    }
}
