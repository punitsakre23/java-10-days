package com.practice.java.codes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProductServiceUsingStream {

    ProductDB db = new ProductDB();

    public void addProduct(Product p) {
//        products.add(p);
        db.insert(p);
    }

    public void printListOfProducts() {
//        products.forEach(p -> System.out.println(p));
//        products.forEach(System.out::println);
//        products.stream().forEach(System.out::println);
        List <Product> list = db.getAll();
        list.forEach(System.out::println);
    }

    public List<Product> getAllProducts() {
        return db.getAll();
    }

    public Product getProduct(String productName) {
//        return products.stream().filter(p -> p.getName().equalsIgnoreCase(productName)).findAny().get();
        return db.getProductByName(productName);
    }

    public List<Product> getAllProductsBasedOnText(String text) {
//        Predicate<Product> nameFilter = name -> name.getName().toLowerCase().contains(text.toLowerCase());
//        Predicate<Product> typeFilter = name -> name.getType().toLowerCase().contains(text.toLowerCase());
//        Predicate<Product> placeFilter = name -> name.getPlace().toLowerCase().contains(text.toLowerCase());
//        return products.stream().filter(nameFilter.or(typeFilter.or(placeFilter)))
//                .collect(Collectors.toList());
        return db.getProductByText(text);
    }

    public List<Product> getAllProductsByPlace(String text) {
//        return products.stream().filter(p -> p.getPlace().equalsIgnoreCase(text)).collect(Collectors.toList());
        return db.getProductByPlace(text);
    }

    public List<Product> getProductsOutOfWarranty() {
        int year = LocalDate.now().getYear();
//        return products.stream().filter(p -> p.getWarranty() < year).collect(Collectors.toList());
        return db.getAllProductsOutOfWarranty(year);
    }

}
