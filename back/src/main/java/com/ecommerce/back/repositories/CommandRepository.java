package com.ecommerce.back.repositories;

import com.ecommerce.back.entities.Command;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandRepository extends JpaRepository<Command, String> {

}
