package com.ecommerce.back.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String idCustomer;

    private String firstname;

    private String lastName;

    private String email;

    private String password;

    private String address;

    private String phone;

    private Date dateCreationAccount;

    @OneToMany(mappedBy = "customer")
    private List<Command> commands =  new ArrayList<>();
}
