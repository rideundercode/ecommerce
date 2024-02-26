package com.ecommerce.back.mappers;

import com.ecommerce.back.dtos.CustomerDTO;
import com.ecommerce.back.entities.Customer;
import org.springframework.beans.BeanUtils;

public class CustomerMapperImpl {

    public CustomerDTO fromcustomer(Customer customer){
        CustomerDTO customerDTO = new CustomerDTO();
        BeanUtils.copyProperties(customerDTO, customer);
        return customerDTO;
    }

    public Customer fromcustomerDTO(CustomerDTO customerDTO){
        Customer customer = new Customer();
        BeanUtils.copyProperties(customer, customerDTO);
        return customer;
    }
}
