package com.ecommerce.back.dtos;

import lombok.Data;

import java.util.Date;

@Data
public class CustomerDTO {

    private String idCustomer;

    private String firstname;

    private String lastName;

    private String email;

    private String password;

    private String address;

    private String phone;

    private Date dateCreationAccount;

}
