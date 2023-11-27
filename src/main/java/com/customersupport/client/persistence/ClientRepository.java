package com.customersupport.client.persistence;

// import java.util.List;

import com.customersupport.client.entities.Client;

// import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ClientRepository extends CrudRepository<Client, Long> {

    // List<Client> findAllByVehicleId(Long idVehicle);
    // @Query("SELECT * FROM clients WHERE clients.vehicleId = :idVehicle")
    // List<Client> findAllClients(Long idVehicle);
}
