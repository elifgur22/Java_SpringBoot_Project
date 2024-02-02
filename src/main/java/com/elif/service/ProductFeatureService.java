package com.elif.service;

import com.elif.entity.ProductFeature;
import com.elif.repository.ProductFeatureRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class ProductFeatureService implements ICrudService<ProductFeature,Long> {
    private final ProductFeatureRepository productFeatureRepository;
    @Override
    public ProductFeature save(ProductFeature productFeature) {
       return productFeatureRepository.save(productFeature);
    }

    @Override
    public ProductFeature update(ProductFeature productFeature) {
        return productFeatureRepository.save(productFeature);
    }

    @Override
    public Iterable<ProductFeature> saveAll(Iterable<ProductFeature> t) {
        return productFeatureRepository.saveAll(t);
    }

    @Override
    public ProductFeature deleteById(Long id) {
        Optional<ProductFeature> optionalProductFeature = productFeatureRepository.findById(id);
        if (optionalProductFeature.isPresent()) {
            return productFeatureRepository.save(optionalProductFeature.get());
        } else {
            throw new NullPointerException("Böyle bir ProductFeature bulunamadı");
        }
    }

    @Override
    public Optional<ProductFeature> findById(Long id) {
        Optional<ProductFeature> optionalProductFeature = productFeatureRepository.findById(id);
        if(optionalProductFeature.isEmpty()){
            throw new NullPointerException("Böyle bir ProductFeature bulunamadı");
        }
        return optionalProductFeature;
    }

    @Override
    public List<ProductFeature> findAll() {
        List<ProductFeature> productFeatureList = productFeatureRepository.findAll();
        if(productFeatureList.isEmpty()){
            throw new NullPointerException("Liste boş");
        }
        return productFeatureList;
    }

    public List<ProductFeature> findAllByFeatureIdIn(List<Long> featureIdList) {
        return productFeatureRepository.findAllByFeatureIdIn(featureIdList);
    }
}
