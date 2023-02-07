package com.kn.kulygin.springbootserverexample.dto;

import lombok.*;

import java.util.List;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class DocumentDtoList {
    private long totalElements;
    private List<DocumentDto> documents;
}
