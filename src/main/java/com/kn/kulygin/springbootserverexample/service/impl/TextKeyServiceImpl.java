package com.kn.kulygin.springbootserverexample.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.kn.kulygin.springbootserverexample.domain.TextKey;
import com.kn.kulygin.springbootserverexample.dto.TextKeyDto;
import com.kn.kulygin.springbootserverexample.dto.TextKeyDtoList;
import com.kn.kulygin.springbootserverexample.dto.search.TextKeySearchDto;
import com.kn.kulygin.springbootserverexample.repository.TextKeyRepository;
import com.kn.kulygin.springbootserverexample.service.TextKeyService;

@Service
public class TextKeyServiceImpl implements TextKeyService {

    private final TextKeyRepository repository;
    private final MappingService mapper;

    public TextKeyServiceImpl(TextKeyRepository repository, MappingService mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public TextKeyDtoList find(TextKeySearchDto searchDto) {
        Page<TextKey> textKeys = repository.findAll(
                Specification
                        .where(hasCode(searchDto.getCode()))
                        .and(hasDescription(searchDto.getDescription()))
                        .and(hasCompany(searchDto.getCompany()))
                        .and(hasDocumentTypes(searchDto.getDocumentTypes()))
                        .and(hasNetworkTypes(searchDto.getNetworkTypes())), PageRequest.of(searchDto.getPage(), searchDto.getPageSize()));
        return TextKeyDtoList.builder()
                .textKeys(mapper.mapAsList(textKeys.getContent(), TextKeyDto.class))
                .totalElements(textKeys.getTotalElements())
                .build();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public TextKeyDto save(TextKeyDto textKeyDto) {
        return mapper.map(repository.save(mapper.map(textKeyDto, TextKey.class)), TextKeyDto.class);
    }

    static Specification<TextKey> hasCode(String code) {
        return (textKey, cq, cb) -> {
            if (code == null) {
                return null;
            } else {
                return cb.like(textKey.get("code"), "%" + code + "%");
            }
        };
    }

    static Specification<TextKey> hasDescription(String description) {
        return (textKey, cq, cb) -> {
            if (description == null) {
                return null;
            } else {
                return cb.like(textKey.get("description"), "%" + description + "%");
            }
        };
    }

    static Specification<TextKey> hasCompany(String company) {
        return (textKey, cq, cb) -> {
            if (company == null) {
                return null;
            } else {
                return cb.like(textKey.get("companyCode"), "%" + company + "%");
            }
        };
    }

    static Specification<TextKey> hasNetworkTypes(String networkTypes) {
        return (textKey, cq, cb) -> {
            if (networkTypes == null) {
                return null;
            } else {
                return cb.like(textKey.get("networkTypes"), "%" + networkTypes + "%");
            }
        };
    }

    static Specification<TextKey> hasDocumentTypes(String documentTypes) {
        return (textKey, cq, cb) -> {
            if (documentTypes == null) {
                return null;
            } else {
                return cb.like(textKey.get("documentTypes"), "%" + documentTypes + "%");
            }
        };
    }
}
