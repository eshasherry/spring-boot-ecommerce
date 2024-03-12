package com.bananas.springbootecommerce.repositories;

import com.bananas.springbootecommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
