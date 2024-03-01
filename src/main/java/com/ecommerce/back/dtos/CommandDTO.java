package com.ecommerce.back.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Data;

import java.util.Date;


@Data
public class CommandDTO {


    private String idCommand;

    @NotNull(message = "Date of command creation cannot be null")
    @PastOrPresent(message = "Date of command creation must be in the past or present")
    private Date dateCreationCommand;

    @NotNull(message = "Total price of command cannot be null")
    private Double priceTotalCommand;
}
