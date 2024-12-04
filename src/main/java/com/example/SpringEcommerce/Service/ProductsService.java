package com.example.SpringEcommerce.Service;

import com.example.SpringEcommerce.Model.Product;
import com.example.SpringEcommerce.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {
    @Autowired
    private ProductRepo productRepo;
    public void addProduct(Product product) {
        productRepo.save(product);

    }
}
