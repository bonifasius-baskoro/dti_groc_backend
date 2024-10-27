package com.bonbon.demo.product;

import com.bonbon.demo.product.DTO.ProductRequest;
import com.bonbon.demo.product.entity.Product;
import com.bonbon.demo.product.entity.ProductMetadata;
import com.bonbon.demo.product.repository.ProductRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

// ProductService.java
@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(UUID id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }
    @Transactional
    public Product createProduct(ProductRequest request) {
        Product product = new Product();
        product.setName(request.getName());
        product.setPrice(request.getPrice());
        product.setWeight(request.getWeight());
        product.setCategory(request.getCategory());
        product.setImageUrl(request.getImageUrl());

        ProductMetadata metadata = getProductMetadata(request, product);

        product.setMetadata(metadata);

        return productRepository.save(product);
    }

    private static ProductMetadata getProductMetadata(ProductRequest request, Product product) {
        ProductMetadata metadata = new ProductMetadata();
        metadata.setUnit(request.getMetadata().getUnit());
        metadata.setWeight(request.getMetadata().getWeight());
        metadata.setCalorie(request.getMetadata().getCalorie());
        metadata.setProteins(request.getMetadata().getProteins());
        metadata.setFats(request.getMetadata().getFats());
        metadata.setCarbs(request.getMetadata().getCarbs());
        metadata.setIncrement(request.getMetadata().getIncrement());
        metadata.setProduct(product);
        return metadata;
    }
}