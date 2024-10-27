package com.bonbon.demo.product.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "product_metadata")
public class ProductMetadata {
    @Id
    @Column(name = "product_id")
    private UUID productId;

    private String unit;
    private Integer weight;
    private Integer calorie;
    private Integer proteins;
    private Integer fats;
    private Integer carbs;
    private Integer increment;

    @JsonBackReference
    @OneToOne
    @JoinColumn(name = "product_id")
    @MapsId
    private Product product;
}
