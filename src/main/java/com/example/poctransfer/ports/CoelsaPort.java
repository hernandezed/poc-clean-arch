package com.example.poctransfer.ports;

import com.example.poctransfer.business.domain.AccountBO;

public interface CoelsaPort {

    AccountBO getAccountByCbu(String cbu);
}
