package com.Luxebnb.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PackageDto {

    private Integer airportCode;
    private String  name;
    private String  city;
    private String  country;
    private String  contactInfo;
}
