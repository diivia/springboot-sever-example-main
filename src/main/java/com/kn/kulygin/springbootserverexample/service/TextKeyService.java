package com.kn.kulygin.springbootserverexample.service;

import com.kn.kulygin.springbootserverexample.dto.*;
import com.kn.kulygin.springbootserverexample.dto.TextKeyDtoList;
import com.kn.kulygin.springbootserverexample.dto.search.*;

public interface TextKeyService {
    TextKeyDtoList find(TextKeySearchDto searchDto);

    void delete(Long id);

    TextKeyDto save(TextKeyDto textKeyDto);
}
