package com.kn.kulygin.springbootserverexample.dto;

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
public class TextKeyDto {
    private Long id;
    private String code;
    private String description;
    private String additionalInfo;
    private String documentTypes;
    private String businessFunctions;
    private String networkTypes;
    private boolean isAvailableForPrinting;
    private boolean isImported;
    private String companyCode;
}
