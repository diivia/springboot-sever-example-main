package com.kn.kulygin.springbootserverexample.service;

import com.kn.kulygin.springbootserverexample.dto.DocumentDtoList;

import java.util.List;

public interface DocumentsService {
    DocumentDtoList find();

    List<String> findAllCodes();

}
