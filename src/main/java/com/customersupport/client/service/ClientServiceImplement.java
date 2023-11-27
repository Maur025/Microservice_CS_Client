package com.customersupport.client.service;

import java.util.List;

import com.customersupport.client.client.VehicleClient;
import com.customersupport.client.dto.VehicleDTO;
import com.customersupport.client.entities.Client;
import com.customersupport.client.http.response.VehicleByClientResponse;
import com.customersupport.client.persistence.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ClientServiceImplement implements IClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private VehicleClient vehicleClient;

    public List<Client> findAll() {
        return (List<Client>) clientRepository.findAll();
    }

    public Client findById(Long id) {
        return clientRepository.findById(id).orElseThrow();
    }

    public void save(Client client) {
        clientRepository.save(client);
    }

    // public List<Client> findByIdVehicle(Long idVehicle) {
    // return clientRepository.findAllClients(idVehicle);
    // }

    public VehicleByClientResponse findVehicleByIdClient(Long idClient) {
        // found client
        Client client = clientRepository.findById(idClient).orElseThrow();
        // get Vehicles list
        List<VehicleDTO> vehicleDTOs = vehicleClient.findAllVehicleByIdClient(idClient);

        return VehicleByClientResponse.builder()
                .name(client.getName())
                .lastName(client.getLastName())
                .mothersLastName(client.getMothersLastName())
                .vehicleDTOs(vehicleDTOs)
                .build();
    }
}
