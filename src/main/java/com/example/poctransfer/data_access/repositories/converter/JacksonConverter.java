package com.example.poctransfer.data_access.repositories.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.AttributeConverter;

public abstract class JacksonConverter<T> implements AttributeConverter<T, String> {

    private Class<T> clazz;
    private ObjectMapper objectMapper;

    public JacksonConverter(Class<T> clazz, ObjectMapper mapper) {
        this.clazz = clazz;
        this.objectMapper = mapper;
    }

    public String convertToDatabaseColumn(T attribute) {
        try {
            return objectMapper.writeValueAsString(attribute);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }


    public T convertToEntityAttribute(String dbData) {
        try {
            return objectMapper.readValue(dbData, clazz);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}

