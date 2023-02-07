package com.kn.kulygin.springbootserverexample.dto;

import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class NetworkTypeDtoList {
    private long totalElements;
    private List<NetworkTypeDto> networkType;
}
