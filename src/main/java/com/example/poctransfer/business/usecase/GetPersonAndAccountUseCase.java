package com.example.poctransfer.business.usecase;

import com.example.poctransfer.business.domain.PersonAccountBO;
import com.example.poctransfer.business.domain.PersonAccountSearchBO;

public interface GetPersonAndAccountUseCase {

    PersonAccountBO execute(PersonAccountSearchBO bo);
}
