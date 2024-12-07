package com.Luxebnb.Model;

import com.Luxebnb.Utill.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class GuestModel extends User{

    private String guest;


    public GuestModel(String firstname, String lastname, String email, String password, Role role) {
        super(firstname, lastname, email, password, role);

    }
}