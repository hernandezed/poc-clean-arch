package com.example.poctransfer.ports.db.mappers;

import com.example.poctransfer.business.domain.TransferBO;
import com.example.poctransfer.data_access.repositories.entities.Transfer;

public interface TransferBoToTransferMapper {

    Transfer map(TransferBO bo);
    TransferBO map(Transfer transfer);
}
