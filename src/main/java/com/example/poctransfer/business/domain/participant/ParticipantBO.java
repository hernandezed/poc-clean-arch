package com.example.poctransfer.business.domain.participant;

import com.example.poctransfer.business.domain.PersonAccountBO;
import com.example.poctransfer.business.domain.PersonAccountSearchBO;

public abstract class ParticipantBO {

    protected PersonAccountBO personAccountBO;

    public void addAdditionalInfo(PersonAccountBO personAccountBO) {
        this.personAccountBO = personAccountBO;
    }

    public abstract PersonAccountSearchBO getPersonAccountSearchBO();

}
