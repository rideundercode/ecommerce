package com.ecommerce.back.services;

import com.ecommerce.back.dtos.CustomerDTO;
import com.ecommerce.back.entities.Customer;
import com.ecommerce.back.exceptions.CustomerNotFoundException;
import com.ecommerce.back.mappers.CustomerMapperImpl;
import com.ecommerce.back.repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository  customerRepository;
    private CustomerMapperImpl customerMapper;
    @Override
    public CustomerDTO createCustomerDTO(CustomerDTO customerDTO) {
        Customer customer = customerMapper.fromCustomerDTO(customerDTO);
        Customer customerSaved = customerRepository.save(customer);
        return customerMapper.fromCustomer(customerSaved);

        //return customerRepository.save(customer);
    }

    @Override
    public CustomerDTO getCustomerById(String idCustomer) throws CustomerNotFoundException {
        Customer customer = customerRepository.findById(idCustomer)
            .orElseThrow(() -> new CustomerNotFoundException("Customer not found with ID:" + idCustomer));
        CustomerDTO customerDTO = customerMapper.fromCustomer(customer);
        return customerDTO;
        //return customerRepository.findById(idCustomer).orElse(null);
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {

        if(customerRepository == null){
            return Collections.emptyList();
        }

        List<Customer> customers =  customerRepository.findAll();
        List<CustomerDTO> customersDTO = customers.stream()
                .map(customer -> customerMapper.fromCustomer(customer))
                .collect(Collectors.toList());
        return customersDTO;

        //return customerRepository.findAll();
    }

    @Override
    public void deletedCustomerById(String idCustomer) {
        customerRepository.deleteById(idCustomer);
    }

}
