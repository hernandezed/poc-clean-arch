package com.example.poctransfer.data_access.connectors.iatx.dtos.request;

public class IatxRequestDto<T> {
    IatxRequestHeaderDto header;
    IatxConfigDataDto configData;
    T body;
}
