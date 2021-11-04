package com.example.poctransfer.business.usecase;

import com.example.poctransfer.business.domain.TransferBO;

public interface CreateTransferUseCase {

    TransferBO create(TransferBO bo);
}
