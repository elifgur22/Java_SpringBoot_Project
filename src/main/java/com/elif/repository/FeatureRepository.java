package com.elif.repository;

import com.elif.entity.Feature;
import com.elif.utility.enums.ESubCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeatureRepository extends JpaRepository<Feature,Long> {
    List<Feature> findAllBySubcategory(ESubCategory subcategory);
}
