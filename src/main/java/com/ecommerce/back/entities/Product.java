package com.ecommerce.back.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
public class Product {
    @Id
    private String idProduct;

    private String name;

    private String description;

    private Double price;

    private String image;

    private Float stock_quantity;

    private Date creationDateCustomer;

    @ManyToMany
    private List<Command> commands =  new ArrayList<>();

}
