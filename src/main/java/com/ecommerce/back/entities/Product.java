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
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
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
