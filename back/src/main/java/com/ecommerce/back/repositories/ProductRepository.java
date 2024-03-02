package com.ecommerce.back.repositories;

import com.ecommerce.back.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
