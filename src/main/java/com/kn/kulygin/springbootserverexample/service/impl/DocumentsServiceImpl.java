package com.kn.kulygin.springbootserverexample.service.impl;

import com.kn.kulygin.springbootserverexample.domain.DocumentList;
import com.kn.kulygin.springbootserverexample.domain.NetworkTypeList;
import com.kn.kulygin.springbootserverexample.dto.DocumentDto;
import com.kn.kulygin.springbootserverexample.dto.DocumentDtoList;
import com.kn.kulygin.springbootserverexample.service.DocumentsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentsServiceImpl implements DocumentsService {
    private final MappingService mapper;

    public DocumentsServiceImpl(MappingService mapper) {
        this.mapper = mapper;
    }

    @Override
    public DocumentDtoList find() {
        return DocumentDtoList
                .builder()
                .documents(mapper.mapAsList(DocumentList.DOCUMENTS, DocumentDto.class))
                .build();
    }

    @Override
    public List<String> findAllCodes() {
        return DocumentList.DOCUMENT_CODES;
    }

}
