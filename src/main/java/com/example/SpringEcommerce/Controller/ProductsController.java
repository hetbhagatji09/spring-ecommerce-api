package com.example.SpringEcommerce.Controller;

import com.example.SpringEcommerce.Model.Product;
import com.example.SpringEcommerce.Service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;
import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/api")
public class ProductsController {
    @Autowired
    private ProductsService
            productsService;
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts(){
        return new ResponseEntity<>(productsService.getAllProducts(), HttpStatus.OK);
    }
    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable int id){
        Product product=productsService.getProduct(id);
        if(product.getId()!=-1){
            return new ResponseEntity<>(product,HttpStatus.OK);

        }
        else  return  new ResponseEntity<>(HttpStatus.NOT_FOUND);


    }

}
