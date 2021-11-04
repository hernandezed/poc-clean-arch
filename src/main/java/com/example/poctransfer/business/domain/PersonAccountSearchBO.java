package com.example.poctransfer.business.domain;

public class PersonAccountSearchBO {

    private String customerId;
    private String accountNumber;
    private String cbu;
    private String documentType;
    private String documentNumber;

    public PersonAccountSearchBO(String customerId, String accountNumber, String cbu, String documentType, String documentNumber) {
        this.customerId = customerId;
        this.accountNumber = accountNumber;
        this.cbu = cbu;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
    }

    public boolean isToSantanderCustomer() {
        //devolver si el beneficiario es cliente o no
    }
}
