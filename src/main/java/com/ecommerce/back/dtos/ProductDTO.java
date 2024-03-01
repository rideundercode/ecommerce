package com.ecommerce.back.dtos;

import lombok.Data;
import java.util.Date;

@Data
public class ProductDTO{
    private String idProduct;

    private String name;

    private String description;

    private Double price;

    private String image;

    private Float stock_quantity;

    private Date creationDateCustomer;

}
