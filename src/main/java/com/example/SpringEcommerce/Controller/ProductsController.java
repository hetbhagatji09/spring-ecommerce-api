package com.example.SpringEcommerce.Controller;

import com.example.SpringEcommerce.Model.Product;
import com.example.SpringEcommerce.Service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductsController {
    @Autowired
    private ProductsService productsService;

    @GetMapping("/products")
    public String getAllproducts(){
        return "all products";
    }

}
