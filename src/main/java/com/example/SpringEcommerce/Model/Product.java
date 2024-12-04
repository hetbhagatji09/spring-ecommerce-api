package com.example.SpringEcommerce.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String brand;
    private String descreption;
    private float price;
    private String category;
    private int quantity;
    private Date date;
    //Stores the MIME type of the image (e.g., "image/png" or "image/jpeg").
    private String imageType;
    //Stores the name of the uploaded image file (e.g., "product1.png").
    private String imageName;
    @Lob
    private byte[] imageData;
    public Product(int id){
        this.id=id;
    }



}
