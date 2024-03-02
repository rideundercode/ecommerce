package com.ecommerce.back.repositories;

import com.ecommerce.back.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
