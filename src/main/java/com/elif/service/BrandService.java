package com.elif.service;

import com.elif.entity.Brand;
import com.elif.repository.BrandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class BrandService implements ICrudService<Brand,Long>{

    private final BrandRepository brandRepository;
    @Override
    public Brand save(Brand brand) {
        return brandRepository.save(brand);
    }

    @Override
    public Brand update(Brand brand) {
        return brandRepository.save(brand);
    }

    @Override
    public Iterable<Brand> saveAll(Iterable<Brand> t) {
        return brandRepository.saveAll(t);
    }

    @Override
    public Brand deleteById(Long id) {
        Optional<Brand> optionalBrand = brandRepository.findById(id);
        if(optionalBrand.isPresent()){
            return brandRepository.save(optionalBrand.get());
        }else{
            throw new NullPointerException("Brand not found");
        }
    }

    @Override
    public Optional<Brand> findById(Long id) {
        Optional<Brand> brand = brandRepository.findById(id);
        if (brand.isPresent()) {
            return brand;
        } else {
            throw new NullPointerException("Brand not found");
        }
    }

    @Override
    public List<Brand> findAll() {
        List<Brand> brandList = brandRepository.findAll();
        if (brandList.isEmpty()) {
            throw new NullPointerException("List is empty.");
        }
        return brandList;
    }
}
