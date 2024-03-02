package com.ecommerce.back.dtos;

import lombok.Data;

import java.util.Date;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

@Data
public class CustomerDTO {

    private String idCustomer;

    @NotBlank(message = "Firstname is required")
    private String firstname;
    
    @NotBlank(message = "Last name is required")
    private String lastName;

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;

    @Size(min = 8, message = "Password must be at least 8 characters")
    private String password;

    private String address;

    private String phone;

    private Date dateCreationAccount;

}
