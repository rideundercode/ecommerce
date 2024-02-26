package com.ecommerce.back.entities;


import com.ecommerce.back.enums.StateCommand;
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
public class Command {
   @Id
   private String idCommand;

   private Date dateCreationCommand;

   private Double priceTotalCommand;

   @Enumerated(EnumType.STRING)
   private StateCommand stateCommand;
   
   @ManyToOne
   private Customer customer;

   @ManyToMany(mappedBy = "commands", fetch = FetchType.LAZY)
    private List<Product> products =  new ArrayList<>();

}
