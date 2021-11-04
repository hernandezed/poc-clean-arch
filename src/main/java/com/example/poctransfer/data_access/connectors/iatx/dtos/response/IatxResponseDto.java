package com.example.poctransfer.data_access.connectors.iatx.dtos.response;

public class IatxResponseDto<T> {
    IatxResponseHeaderDto header;
    IatxErrorDto error;
    T data;
}
