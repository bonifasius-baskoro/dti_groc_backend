package com.bonbon.demo.product.DTO;

import lombok.Data;

@Data
public class ProductMetadataRequest {
    private String unit;
    private Integer weight;
    private Integer calorie;
    private Integer proteins;
    private Integer fats;
    private Integer carbs;
    private Integer increment;
}
