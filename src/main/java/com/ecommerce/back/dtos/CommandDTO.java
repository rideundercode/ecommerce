package com.ecommerce.back.dtos;

import com.ecommerce.back.enums.StateCommand;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

import java.util.Date;


@Data
public class CommandDTO {
    private String idCommand;

    private Date dateCreationCommand;

    private Double priceTotalCommand;


}
