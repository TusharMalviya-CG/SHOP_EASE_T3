package com.shopEase.request;

import java.util.HashSet;
import java.util.Set;

import com.shopEase.model.Size;
import com.shopEase.user.domain.ProductSize;

import lombok.Data;

@Data
public class CreateProductRequest {
	
    private String title;

    private String description;

    private int price;

    private int discountedPrice;
   
    private int discountPersent;

    private int quantity;

    private String brand;

    private String color;

    private Set<Size> size=new HashSet<>();

//    private String imageUrl;

    private String topLavelCategory;
    private String secondLavelCategory;
    private String thirdLavelCategory;
}