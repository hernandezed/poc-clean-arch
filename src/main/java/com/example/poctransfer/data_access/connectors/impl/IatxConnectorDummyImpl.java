package com.example.poctransfer.data_access.connectors.impl;

import com.example.poctransfer.data_access.connectors.iatx.IatxConnector;
import com.example.poctransfer.data_access.connectors.iatx.dtos.request.IatxRequestDto;
import com.example.poctransfer.data_access.connectors.iatx.dtos.response.IatxResponseDto;
import org.springframework.stereotype.Component;

@Component
public class IatxConnectorDummyImpl implements IatxConnector {
    @Override
    public IatxResponseDto call(IatxRequestDto requestDto) {
        return null;
    }
}
