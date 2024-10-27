package com.bonbon.demo.product.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    @UuidGenerator
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;
    private String name;
    private Double price;
    private Integer weight;
    private String category;

    @Column(name = "image_url")
    private String imageUrl;

    @JsonManagedReference
    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL)
    private ProductMetadata metadata;
}
