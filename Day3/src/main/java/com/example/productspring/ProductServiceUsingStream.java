package com.example.productspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class ProductServiceUsingStream {

    @Autowired
    ProductDB db;
//
//    public void addProduct(Product p) {
//        db.save(p);
//    }
//
    public void printListOfProducts() {
//        products.forEach(p -> System.out.println(p));
//        products.forEach(System.out::println);
//        products.stream().forEach(System.out::println);
        List<Product> list = db.findAll();
        list.forEach(System.out::println);
    }
//
    public List<Product> getAllProducts() {
        return db.findAll();
    }

    public Product getProduct(String productName) {
//        return products.stream().filter(p -> p.getName().equalsIgnoreCase(productName)).findAny().get();
        return db.findProductByName(productName);
    }
//
    public List<Product> getAllProductsBasedOnText(String text) {
//        Predicate<Product> nameFilter = name -> name.getName().toLowerCase().contains(text.toLowerCase());
//        Predicate<Product> typeFilter = name -> name.getType().toLowerCase().contains(text.toLowerCase());
//        Predicate<Product> placeFilter = name -> name.getPlace().toLowerCase().contains(text.toLowerCase());
//        return products.stream().filter(nameFilter.or(typeFilter.or(placeFilter)))
//                .collect(Collectors.toList());
        return db.findProductByNameContainsIgnoreCaseOrTypeContainsIgnoreCaseOrPlaceContainsIgnoreCase(text, text, text);
    }
//
    public List<Product> getAllProductsByPlace(String text) {
//        return products.stream().filter(p -> p.getPlace().equalsIgnoreCase(text)).collect(Collectors.toList());
        return db.findProductsByPlaceContainsIgnoreCase(text);
    }
//
    public List<Product> getProductsOutOfWarranty() {
        int year = LocalDate.now().getYear();
//        return products.stream().filter(p -> p.getWarranty() < year).collect(Collectors.toList());
        return db.getProductByWarrantyIsLessThan(year);
    }

}
