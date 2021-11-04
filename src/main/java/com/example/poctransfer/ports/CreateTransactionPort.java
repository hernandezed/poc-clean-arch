package com.example.poctransfer.ports;

import com.example.poctransfer.business.domain.TransferBO;
import com.example.poctransfer.business.domain.ExternalTransferDataBO;

public interface CreateTransactionPort {

    ExternalTransferDataBO create(TransferBO bo);
}
