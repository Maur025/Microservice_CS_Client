package com.customersupport.client.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.customersupport.client.dto.VehicleDTO;

@FeignClient(name = "msvc-vehicle", url = "localhost:8080/api/vehicle")
public interface VehicleClient {

    @GetMapping("/search_by_client/{idClient}")
    List<VehicleDTO> findAllVehicleByIdClient(@PathVariable Long idClient);
}
