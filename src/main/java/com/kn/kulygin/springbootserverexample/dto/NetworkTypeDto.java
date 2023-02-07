package com.kn.kulygin.springbootserverexample.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class NetworkTypeDto {
    private Long id;
    private String code;
}
