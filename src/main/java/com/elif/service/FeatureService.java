package com.elif.service;

import com.elif.entity.Feature;
import com.elif.repository.FeatureRepository;
import com.elif.utility.enums.ESubCategory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class FeatureService implements ICrudService<Feature,Long> {

    private final FeatureRepository featureRepository;

    @Override
    public Feature save(Feature feature) {
        return featureRepository.save(feature);
    }

    @Override
    public Feature update(Feature feature) {
        return featureRepository.save(feature);
    }

    @Override
    public Iterable<Feature> saveAll(Iterable<Feature> t) {
        return featureRepository.saveAll(t);
    }

    @Override
    public Feature deleteById(Long id) {
        Optional<Feature> optionalFeature = featureRepository.findById(id);
        if(optionalFeature.isPresent()){
            return featureRepository.save(optionalFeature.get());
        }else{
            throw new NullPointerException("Feature not found");
        }
    }

    @Override
    public Optional<Feature> findById(Long id) {
        Optional<Feature> feature = featureRepository.findById(id);
        if (feature.isPresent()) {
            return feature;
        } else {
            throw new NullPointerException("Brand not found");
        }
    }

    @Override
    public List<Feature> findAll() {
        List<Feature> featureList = featureRepository.findAll();
        if (featureList.isEmpty()) {
            throw new NullPointerException("List is empty.");
        }
        return featureList;
    }

    public List<Feature> findAllBySubcategory(ESubCategory subcategory) {
        return featureRepository.findAllBySubcategory(subcategory);
    }
}
