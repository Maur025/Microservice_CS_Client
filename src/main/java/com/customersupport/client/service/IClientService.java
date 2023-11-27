package com.customersupport.client.service;

import java.util.List;

import com.customersupport.client.entities.Client;
import com.customersupport.client.http.response.VehicleByClientResponse;

public interface IClientService {
    List<Client> findAll();

    Client findById(Long id);

    void save(Client client);

    // List<Client> findByIdVehicle(Long idVehicle);

    VehicleByClientResponse findVehicleByIdClient(Long idClient);
}
