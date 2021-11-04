package com.example.poctransfer.business.domain;

import java.math.BigInteger;

public class TransferReferenceBO {
    private BigInteger id;
    private String requestId;
    private String status;

    public TransferReferenceBO(BigInteger id, String requestId, String status) {
        this.id = id;
        this.requestId = requestId;
        this.status = status;
    }
}
