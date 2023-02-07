package com.kn.kulygin.springbootserverexample.dto.search;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TextKeySearchDto extends SearchDto {
    private String code;
    private String company;
    private String textKeyMapping;
    private String description;
    private String networkTypes;
    private String documentTypes;
}
