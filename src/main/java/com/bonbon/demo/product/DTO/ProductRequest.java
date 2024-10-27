package com.bonbon.demo.product.DTO;

import lombok.Data;

@Data
public class ProductRequest {
    private String name;
    private Double price;
    private Integer weight;
    private String category;
    private String imageUrl;
    private ProductMetadataRequest metadata;
}
