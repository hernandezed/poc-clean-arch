package com.example.poctransfer.ports;

import com.example.poctransfer.business.domain.TransferBO;

import java.math.BigInteger;

public interface TransferEntityPort {
    BigInteger insert(TransferBO bo);
}
