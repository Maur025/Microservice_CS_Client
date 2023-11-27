package com.customersupport.client.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@Table(name = "clients")
@AllArgsConstructor
@NoArgsConstructor

public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "mothers_last_name")
    private String mothersLastName;

    @Column(name = "document_type")
    private String documentType;

    @Column(name = "document_number")
    private String documentNumber;

    @Column(name = "birth_date")
    private String birthDate;

    @Column(name = "vehicle_id")
    private Long vehicleId;
}
