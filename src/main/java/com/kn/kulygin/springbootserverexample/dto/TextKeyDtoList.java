package com.kn.kulygin.springbootserverexample.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class TextKeyDtoList {
    private long totalElements;
    private List<TextKeyDto> textKeys;
}
