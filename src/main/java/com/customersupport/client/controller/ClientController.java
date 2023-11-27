package com.customersupport.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.customersupport.client.entities.Client;
import com.customersupport.client.service.IClientService;

@RestController
@RequestMapping("/api/client")

public class ClientController {
    @Autowired
    private IClientService clientService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveClient(@RequestBody Client client) {
        clientService.save(client);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllClient() {
        return ResponseEntity.ok(clientService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(clientService.findById(id));
    }

    @GetMapping("/search_vehicles/{idClient}")
    public ResponseEntity<?> findVehicleByIdClient(@PathVariable Long idClient) {
        return ResponseEntity.ok(clientService.findVehicleByIdClient(idClient));
    }
}
