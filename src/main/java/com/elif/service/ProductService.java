package com.elif.service;

import com.elif.entity.Product;
import com.elif.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService implements ICrudService<Product,Long> {

    private final ProductRepository productRepository;

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product update(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Iterable<Product> saveAll(Iterable<Product> t) {
        return productRepository.saveAll(t);
    }

    @Override
    public Product deleteById(Long id) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if(optionalProduct.isPresent()){
            return productRepository.save(optionalProduct.get());
        }else{
            throw new NullPointerException("Product not found");
        }
    }

    @Override
    public Optional<Product> findById(Long id) {
        Optional<Product> product = productRepository.findById(id);
        if (product.isPresent()) {
            return product;
        } else {
            throw new NullPointerException("Product not found");
        }
    }

    @Override
    public List<Product> findAll() {
        List<Product> productList = productRepository.findAll();
        if (productList.isEmpty()) {
            throw new NullPointerException("List is empty.");
        }
        return productList;
    }

    public List<Product> findAllByIdIn(List<Long> productIdList) {
        return productRepository.findAllByIdIn(productIdList);
    }
}
