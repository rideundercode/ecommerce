package com.ecommerce.back.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Data;
import java.util.Date;

@Data
public class ProductDTO {
    private String idProduct;

    @NotBlank(message = "Product name is required")
    private String name;

    private String description;

    @NotNull(message = "Price cannot be null")
    @Min(value = 0, message = "Price must be positive")
    private Double price;

    private String image;

    @NotNull(message = "Stock quantity cannot be null")
    @Min(value = 0, message = "Stock quantity must be positive")
    private Float stock_quantity;

    @PastOrPresent(message = "Creation date must be in the past or present")
    private Date creationDateCustomer;
}
