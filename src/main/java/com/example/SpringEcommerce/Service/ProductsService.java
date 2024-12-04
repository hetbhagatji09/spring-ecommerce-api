package com.example.SpringEcommerce.Service;

import com.example.SpringEcommerce.Model.Product;
import com.example.SpringEcommerce.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductsService {
    @Autowired
    private ProductRepo productRepo;
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }


    public Product getProduct(int id) {
        return productRepo.findById(id).orElse(new Product(-1));
    }
}
