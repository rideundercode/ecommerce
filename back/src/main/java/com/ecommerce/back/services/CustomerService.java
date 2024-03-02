package com.ecommerce.back.services;
import com.ecommerce.back.dtos.CustomerDTO;
import com.ecommerce.back.entities.Customer;
import com.ecommerce.back.entities.Product;
import com.ecommerce.back.exceptions.CustomerNotFoundException;

import java.util.List;

public interface CustomerService {

    CustomerDTO createCustomerDTO(CustomerDTO customerDTO);
    CustomerDTO getCustomerById(String idCustomer) throws CustomerNotFoundException;
    List<CustomerDTO> getAllCustomers();
    void deletedCustomerById(String idCustomer);

}
