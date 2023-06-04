package com.example.productspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class ProductSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProductSpringApplication.class, args);

		ProductServiceUsingStream streamService = context.getBean(ProductServiceUsingStream.class);

//		List<Product> list = streamService.getAllProducts();
//		list.forEach(System.out::println);

//		streamService.printListOfProducts();

//        Product product = streamService.getProduct("Apple Mouse");
//        System.out.println(product);

//        List<Product> products = streamService.getAllProductsByPlace("White Table");
//        products.forEach(System.out::println);

//        List<Product> products = streamService.getAllProductsBasedOnText("black");
//        products.forEach(System.out::println);

        List<Product> products = streamService.getProductsOutOfWarranty();
        products.forEach(System.out::println);
	}

}
