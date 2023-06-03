package com.practice.java.codes;

import java.util.List;

public class Main {

    public static void main(String[] args) {

//        ProductService service = new ProductService();

//        Product p = new Product("hp", "Laptop", "Brown Table", 2022);
//        service.addProduct(p);

//        service.addProduct(new Product("hp", "Laptop", "Brown Table", 2022));

//        service.addProduct(new Product("Type C", "Cable", "Black Drawer", 2024));
//        service.addProduct(new Product("Mac Studio", "Computer", "White Table", 2025));
//        service.addProduct(new Product("Focusrite Mixer", "Audio System", "White Table", 2025));
//        service.addProduct(new Product("Asus Vivobook", "Laptop", "Brown Drawer", 2021));
//        service.addProduct(new Product("Asus Rog", "Laptop", "Black Table", 2021));
//        service.addProduct(new Product("Macbook pro", "Laptop", "Brown Drawer", 2022));
//        service.addProduct(new Product("Wacom Pad", "Writing Pad", "Black Drawer", 2020));
//        service.addProduct(new Product("Apple Keyboard", "Keyboard", "White Table", 2022));
//        service.addProduct(new Product("Logitech Keyboard", "Keyboard", "Black Table", 2024));
//        service.addProduct(new Product("Hdmi cable", "Cable", "Black Drawer", 2024));
//        service.addProduct(new Product("Java Black Book", "Cable", "Shelf", 2024));
//        service.addProduct(new Product("Logi Mouse", "Mouse", "Black Table", 2022));
//        service.addProduct(new Product("Apple Mouse", "Mouse", "White Table", 2022));
//        service.addProduct(new Product("Lenovo Mouse", "Mouse", "Black Drawer", 2022));
//        service.addProduct(new Product("BlackBeast", "Computer", "White Table", 2020));

//        service.printListOfProducts();

//        List<Product> products = service.getAllProducts();
//        for (Product product: products) {
//            System.out.println(product);
//        }

//        Product product = service.getProduct("Apple Mouse");
//        System.out.println(product);

//        List<Product> products = service.getAllProductsBasedOnText("black");
//        for (Product product: products) {
//            System.out.println(product);
//        }

//        List<Product> products = service.getAllProductsByPlace("White Table");
//        for (Product product: products) {
//            System.out.println(product);
//        }

//        List<Product> products = service.getProductsOutOfWarranty();
//        for (Product product: products) {
//            System.out.println(product);
//        }

        ProductServiceUsingStream streamService = new ProductServiceUsingStream();

//        streamService.addProduct(new Product("Type C", "Cable", "Black Drawer", 2024));
//        streamService.addProduct(new Product("Mac Studio", "Computer", "White Table", 2025));
//        streamService.addProduct(new Product("Focusrite Mixer", "Audio System", "White Table", 2025));
//        streamService.addProduct(new Product("Asus Vivobook", "Laptop", "Brown Drawer", 2021));
//        streamService.addProduct(new Product("Asus Rog", "Laptop", "Black Table", 2021));
//        streamService.addProduct(new Product("Macbook pro", "Laptop", "Brown Drawer", 2022));
//        streamService.addProduct(new Product("Wacom Pad", "Writing Pad", "Black Drawer", 2020));
//        streamService.addProduct(new Product("Apple Keyboard", "Keyboard", "White Table", 2022));
//        streamService.addProduct(new Product("Logitech Keyboard", "Keyboard", "Black Table", 2024));
//        streamService.addProduct(new Product("Hdmi cable", "Cable", "Black Drawer", 2024));
//        streamService.addProduct(new Product("Java Black Book", "Cable", "Shelf", 2024));
//        streamService.addProduct(new Product("Logi Mouse", "Mouse", "Black Table", 2022));
//        streamService.addProduct(new Product("Apple Mouse", "Mouse", "White Table", 2022));
//        streamService.addProduct(new Product("Lenovo Mouse", "Mouse", "Black Drawer", 2022));
//        streamService.addProduct(new Product("BlackBeast", "Computer", "White Table", 2020));

//        streamService.printListOfProducts();

//        List<Product> list = streamService.getAllProducts();
//        list.forEach(System.out::println);

//        Product product = streamService.getProduct("Apple Mouse");
//        System.out.println(product);

//        List<Product> products = streamService.getAllProductsBasedOnText("black");
//        products.forEach(System.out::println);

//        List<Product> products = streamService.getAllProductsByPlace("White Table");
//        products.forEach(System.out::println);

        List<Product> products = streamService.getProductsOutOfWarranty();
        products.forEach(System.out::println);

    }
}
