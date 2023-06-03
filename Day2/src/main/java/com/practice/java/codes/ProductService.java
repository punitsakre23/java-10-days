package com.practice.java.codes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Product> products = new ArrayList<>();
    public void addProduct(Product p) {
        products.add(p);
    }

    public void printListOfProducts() {
        for (Product product: products) {
            System.out.println(product);
        }
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProduct(String productName) {
        for (Product p :
                products) {
            if (p.getName().equalsIgnoreCase(productName)) {
                return p;
            }
        }
        return null;
    }

    public List<Product> getAllProductsBasedOnText(String text) {
        List <Product> filteredList = new ArrayList<>();

        for (Product p :
                products) {
            if (p.getName().toLowerCase().contains(text.toLowerCase()) ||
                p.getType().toLowerCase().contains(text.toLowerCase()) ||
                p.getPlace().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(p);
            }
        }
        return filteredList;
    }

    public List<Product> getAllProductsByPlace(String text) {
        List <Product> prods = new ArrayList<>();
        for (Product p :
                products) {
            if (p.getPlace().equalsIgnoreCase(text.toLowerCase())) {
                prods.add(p);
            }
        }
        return prods;
    }

    public List<Product> getProductsOutOfWarranty() {
        int year = LocalDate.now().getYear();
        List <Product> expiredProducts = new ArrayList<>();
        for (Product p :
                products) {
            if (p.getWarranty() < year) {
                expiredProducts.add(p);
            }
        }
        return expiredProducts;
    }
}
