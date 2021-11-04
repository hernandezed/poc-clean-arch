package com.example.poctransfer.data_access.repositories.converter;

import com.example.poctransfer.data_access.repositories.entities.AdditionalData;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AdditionalDataConverter extends JacksonConverter<AdditionalData> {
    public AdditionalDataConverter(Class<AdditionalData> clazz, ObjectMapper mapper) {
        super(clazz, mapper);
    }
}
