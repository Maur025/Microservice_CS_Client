package com.customersupport.client.http.response;

import java.util.List;

import com.customersupport.client.dto.VehicleDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class VehicleByClientResponse {
    private String name;
    private String lastName;
    private String mothersLastName;
    private List<VehicleDTO> vehicleDTOs;
}
