package com.elif.controller;
import com.elif.entity.Model;
import com.elif.entity.Product;
import com.elif.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.elif.utility.constants.RestApiUrls.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(PRODUCT)
public class ProductController {
    private final ProductService productService;

    @GetMapping(ADD)
    public ResponseEntity<Product> save(@RequestBody Product product){
        return ResponseEntity.ok(productService.save(product));
    }

    @GetMapping(GET_BY_ID)
    public ResponseEntity<Optional<Product>> findById(@PathVariable Long id){
        return ResponseEntity.ok(productService.findById(id));
    }

    @GetMapping(GET_ALL)
    public ResponseEntity<List<Product>> findAll(){
        List<Product> productList = productService.findAll();
        if(productList.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(productList);
    }



}
