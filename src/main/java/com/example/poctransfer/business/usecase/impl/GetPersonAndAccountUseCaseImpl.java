package com.example.poctransfer.business.usecase.impl;

import com.example.poctransfer.business.domain.PersonAccountBO;
import com.example.poctransfer.business.domain.PersonAccountSearchBO;
import com.example.poctransfer.business.usecase.GetPersonAndAccountUseCase;
import com.example.poctransfer.ports.AccountsPort;
import com.example.poctransfer.ports.CoelsaPort;
import com.example.poctransfer.ports.CustomersPort;

public class GetPersonAndAccountUseCaseImpl implements GetPersonAndAccountUseCase {
    private final AccountsPort accountsPort;
    private final CustomersPort customersPort;
    private final CoelsaPort coelsaPort;

    public GetPersonAndAccountUseCaseImpl(AccountsPort accountsPort, CustomersPort customersPort, CoelsaPort coelsaPort) {
        this.accountsPort = accountsPort;
        this.customersPort = customersPort;
        this.coelsaPort = coelsaPort;
    }

    @Override
    public PersonAccountBO execute(PersonAccountSearchBO bo) {
        if(bo.isToSantanderCustomer()) {
            //accounts
            //customers
        } else {
            //coelsa
        }
        return null;
    }
}
