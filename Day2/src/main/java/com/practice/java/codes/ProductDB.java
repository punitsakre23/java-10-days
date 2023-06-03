package com.practice.java.codes;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDB {

    Connection conn = null;

    public ProductDB() {
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void insert(Product p) {

        String query = "INSERT INTO product (name, type, place, warranty) " +
                        "VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setString(1, p.getName());
            stmt.setString(2, p.getType());
            stmt.setString(3, p.getPlace());
            stmt.setInt(4, p.getWarranty());

            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public List<Product> getAll() {
        List<Product> products = new ArrayList<>();

        String query = "SELECT name, type, place, warranty" +
                " FROM product";

        try {
            PreparedStatement stmt = conn.prepareStatement(query);

            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                Product p = new Product();
                p.setName(resultSet.getString(1));
                p.setType(resultSet.getString(2));
                p.setPlace(resultSet.getString(3));
                p.setWarranty(resultSet.getInt(4));
                products.add(p);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return products;
    }

    public Product getProductByName(String productName) {
        Product product = new Product();

        String query = "SELECT name, type, place, warranty" +
                " FROM product WHERE LOWER(name) = ?";

        try {
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setString(1, productName.toLowerCase());

            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {

                product.setName(resultSet.getString(1));
                product.setType(resultSet.getString(2));
                product.setPlace(resultSet.getString(3));
                product.setWarranty(resultSet.getInt(4));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return product;
    }

    public List<Product> getProductByText(String text) {
        List<Product> products = new ArrayList<>();

        String query = "SELECT name, type, place, warranty FROM product WHERE LOWER(name) LIKE '%"+text+"%' " +
                "OR LOWER(type) LIKE '%"+text+"%' OR LOWER(place) LIKE '%"+text+"%'";

        try {
            PreparedStatement stmt = conn.prepareStatement(query);

            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                Product p = new Product();
                p.setName(resultSet.getString(1));
                p.setType(resultSet.getString(2));
                p.setPlace(resultSet.getString(3));
                p.setWarranty(resultSet.getInt(4));
                products.add(p);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return products;
    }

    public List<Product> getProductByPlace(String text) {
        List<Product> products = new ArrayList<>();

        String query = "SELECT name, type, place, warranty" +
                " FROM product WHERE LOWER(place) = ?";

        try {
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setString(1, text.toLowerCase());

            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                Product p = new Product();
                p.setName(resultSet.getString(1));
                p.setType(resultSet.getString(2));
                p.setPlace(resultSet.getString(3));
                p.setWarranty(resultSet.getInt(4));
                products.add(p);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return products;
    }

    public List <Product> getAllProductsOutOfWarranty(int year) {

        List<Product> products = new ArrayList<>();

        String query = "SELECT name, type, place, warranty FROM product WHERE warranty < ?";

        try {
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setInt(1, year);

            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                Product p = new Product();
                p.setName(resultSet.getString(1));
                p.setType(resultSet.getString(2));
                p.setPlace(resultSet.getString(3));
                p.setWarranty(resultSet.getInt(4));
                products.add(p);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return products;
    }
}
