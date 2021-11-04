package com.example.poctransfer.ports;

import com.example.poctransfer.business.domain.AccountBO;
import com.example.poctransfer.business.domain.UniformBankKeyBO;

public interface AccountsPort {

    AccountBO findByCustomerIdCurrencyAndCbu(String customerId, String currency, String cbu);

    AccountBO findByCustomerIdAndNumber(String customerId, String number);

}
