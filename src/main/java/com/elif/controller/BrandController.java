package com.elif.controller;
import com.elif.entity.Brand;
import com.elif.service.BrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.elif.utility.constants.RestApiUrls.*;


@RestController
@RequiredArgsConstructor
@RequestMapping(BRAND)
public class BrandController {
    private final BrandService brandService;

    @GetMapping(ADD)
    public ResponseEntity<Brand> save(@RequestBody Brand brand){
        return ResponseEntity.ok(brandService.save(brand));
    }

    @GetMapping(GET_BY_ID)
    public ResponseEntity<Optional<Brand>> findById(@PathVariable Long id){
        return ResponseEntity.ok(brandService.findById(id));
    }

    @GetMapping(GET_ALL)
    public ResponseEntity<List<Brand>> findAll(){
        return ResponseEntity.ok(brandService.findAll());
    }



}
