package com.Luxebnb.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PackageModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer airportCode;
    private String name;
    private String city;
    private String country;
    private String contactInfo;



}
