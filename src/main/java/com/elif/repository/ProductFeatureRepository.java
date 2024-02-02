package com.elif.repository;

import com.elif.entity.Feature;
import com.elif.entity.ProductFeature;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductFeatureRepository extends JpaRepository<ProductFeature,Long> {
    ProductFeature findByFeatureId(Long featureId);
    List<ProductFeature> findAllByFeatureIdIn(List<Long> featureIdList);

}
