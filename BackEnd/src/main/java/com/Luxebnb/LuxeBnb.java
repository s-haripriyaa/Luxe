package com.Luxebnb;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class LuxeBnb {

    public static void main(String[] args) {
        SpringApplication.run(LuxeBnb.class, args);
    }

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }




}
