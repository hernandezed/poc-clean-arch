package com.example.poctransfer.ports;

import com.example.poctransfer.business.domain.PersonBO;
import com.example.poctransfer.enums.DocumentType;

public interface CustomersPort {

    PersonBO getCustomerByDocument(DocumentType type, String number);
}
