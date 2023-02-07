package com.kn.kulygin.springbootserverexample.service;

import com.kn.kulygin.springbootserverexample.domain.TextKey;
import com.kn.kulygin.springbootserverexample.dto.*;
import com.kn.kulygin.springbootserverexample.dto.TextKeyDtoList;
import com.kn.kulygin.springbootserverexample.dto.search.*;
import javassist.NotFoundException;

public interface TextKeyService {
    TextKeyDtoList find(TextKeySearchDto searchDto);

    TextKeyDtoList findUnique(TextKeySearchDto searchDto);

    void delete(Long id);

    TextKey findById(Long id);

    TextKeyDto save(TextKeyDto textKeyDto);
}
