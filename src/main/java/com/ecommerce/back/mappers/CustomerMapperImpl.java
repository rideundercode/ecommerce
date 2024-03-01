package com.ecommerce.back.mappers;

import com.ecommerce.back.dtos.CustomerDTO;
import com.ecommerce.back.entities.Customer;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerMapperImpl {

    public CustomerDTO fromCustomer(Customer customer){
        CustomerDTO customerDTO = new CustomerDTO();
        BeanUtils.copyProperties(customer , customerDTO);
        /*
        customerDTO.setIdCustomer(customer.getIdCustomer());
        customerDTO.setFirstname(customer.getFirstname());
        customerDTO.setLastName(customer.getLastName());
        customerDTO.setEmail(customer.getEmail());
        customerDTO.setPassword(customer.getPassword());
        customerDTO.setAddress(customer.getAddress());
        customerDTO.setPhone(customer.getPhone());
        customerDTO.setDateCreationAccount(customer.getDateCreationAccount());
        */
        return customerDTO;
    }

    public Customer fromCustomerDTO(CustomerDTO customerDTO){
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDTO, customer );
        /*
        customer.setIdCustomer(customerDTO.getIdCustomer());
        customer.setFirstname(customerDTO.getFirstname());
        customer.setLastName(customerDTO.getLastName());
        customer.setEmail(customerDTO.getEmail());
        customer.setPassword(customerDTO.getPassword());
        customer.setAddress(customerDTO.getAddress());
        customer.setPhone(customerDTO.getPhone());
        customer.setDateCreationAccount(customerDTO.getDateCreationAccount());
         */
        return customer;
    }
}
