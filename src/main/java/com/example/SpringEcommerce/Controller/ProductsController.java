package com.example.SpringEcommerce.Controller;

import com.example.SpringEcommerce.Model.Product;
import com.example.SpringEcommerce.Service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class ProductsController {
    @Autowired
    private ProductsService productsService;
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
    @GetMapping("/products")
    public List<Product> getProducts(){
        return productsService.getAllProducts();
    }

}
