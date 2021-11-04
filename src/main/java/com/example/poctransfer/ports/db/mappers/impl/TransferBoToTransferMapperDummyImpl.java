package com.example.poctransfer.ports.db.mappers.impl;

import com.example.poctransfer.business.domain.TransferBO;
import com.example.poctransfer.ports.db.mappers.TransferBoToTransferMapper;
import com.example.poctransfer.data_access.repositories.entities.Transfer;
import org.springframework.stereotype.Component;

@Component
public class TransferBoToTransferMapperDummyImpl implements TransferBoToTransferMapper {
    @Override
    public Transfer map(TransferBO bo) {
        return null;
    }

    @Override
    public TransferBO map(Transfer transfer) {
        return null;
    }
}
