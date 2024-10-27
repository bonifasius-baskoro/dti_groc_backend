package com.bonbon.demo.product.repository;

import com.bonbon.demo.product.entity.ProductMetadata;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductMetadataRepository extends JpaRepository<ProductMetadata, UUID> {
}
