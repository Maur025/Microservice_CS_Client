package com.customersupport.client.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class VehicleDTO {
    private String mark;
    private String model;
    private String year;
    private String plaque;
    private Long clientId;
}
