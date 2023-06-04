package com.example.productspring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDB extends JpaRepository<Product, Integer> {

    Product findProductByName(String name);

    List<Product> findProductsByPlaceContainsIgnoreCase(String place);

    List<Product> findProductByNameContainsIgnoreCaseOrTypeContainsIgnoreCaseOrPlaceContainsIgnoreCase(String text1, String text2, String text3);

    List<Product> getProductByWarrantyIsLessThan(int year);
}
