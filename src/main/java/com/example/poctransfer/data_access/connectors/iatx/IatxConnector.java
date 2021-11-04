package com.example.poctransfer.data_access.connectors.iatx;

import com.example.poctransfer.data_access.connectors.iatx.dtos.request.IatxRequestDto;
import com.example.poctransfer.data_access.connectors.iatx.dtos.response.IatxResponseDto;

public interface IatxConnector {
    <T> IatxResponseDto call(IatxRequestDto<T> requestDto);
}
