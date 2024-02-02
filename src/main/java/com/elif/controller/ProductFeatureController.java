package com.elif.controller;

import com.elif.entity.Feature;
import com.elif.entity.Product;
import com.elif.entity.ProductFeature;
import com.elif.exception.ErrorType;
import com.elif.exception.TryMeAppException;
import com.elif.service.FeatureService;
import com.elif.service.ProductFeatureService;
import com.elif.service.ProductService;
import com.elif.utility.enums.ESubCategory;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.elif.utility.constants.RestApiUrls.*;

import static com.elif.utility.constants.RestApiUrls.PRODUCT;

@RestController
@RequiredArgsConstructor
@RequestMapping(PRODUCT_FEATURE)
public class ProductFeatureController {
    private final ProductFeatureService productFeatureService;
    private final ProductService productService;
    private final FeatureService featureService;


//Subcategoriyi yazdığımızda tüm ürünleri getiren metot;
    @PostMapping(GET_BY_SUBCATEGORY)
    public ResponseEntity<List<Product>> addProductFeature(
            @RequestParam("subcategory") ESubCategory subcategory
    ) {
        List<Feature> featureList = featureService.findAllBySubcategory(subcategory);

        if (featureList.isEmpty()) {
            throw new RuntimeException("Belirtilen subcategory için özellik bulunamadı");
        } else {
            List<Long> featureIdList = featureList.stream().map(Feature::getId).toList();
            List<ProductFeature> pfList = productFeatureService.findAllByFeatureIdIn(featureIdList);

            if (pfList.isEmpty()) {
                throw new TryMeAppException(ErrorType.INTERNAL_ERROR, "Bu özellikte ürünler mevcut değildir.");
            } else {
                List<Long> productIdList = pfList.stream().map(ProductFeature::getProductId).toList();

                List<Product> productList = productService.findAllByIdIn(productIdList);
                if (productList.isEmpty()) {
                    throw new TryMeAppException(ErrorType.INTERNAL_ERROR, "Ürünler bulunamadı");
                } else {
                    return ResponseEntity.ok(productList);
                }
            }
        }
    }


    @GetMapping(GET_ALL)
    public ResponseEntity<List<ProductFeature>> findAll(){
        List<ProductFeature> productFeatureList = productFeatureService.findAll();
        if(productFeatureList.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(productFeatureList);
    }

}
