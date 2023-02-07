package com.kn.kulygin.springbootserverexample.service.impl;

import com.kn.kulygin.springbootserverexample.domain.DocumentList;
import com.kn.kulygin.springbootserverexample.domain.NetworkTypeList;
import com.kn.kulygin.springbootserverexample.dto.NetworkTypeDto;
import com.kn.kulygin.springbootserverexample.dto.NetworkTypeDtoList;
import com.kn.kulygin.springbootserverexample.service.NetworkTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NetworkTypeServiceImpl implements NetworkTypeService
{
    private final MappingService mapper;

    public NetworkTypeServiceImpl(MappingService mapper) {
        this.mapper = mapper;
    }


    @Override
    public List<String> findAllTypes() {
        return NetworkTypeList.NETWORK_TYPE_CODES;
    }
}
