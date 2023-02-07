package com.kn.kulygin.springbootserverexample.dto;

import lombok.*;
import org.springframework.data.domain.jaxb.SpringDataJaxb;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class DocumentDto {
    private Long id;
    private String code;
}
