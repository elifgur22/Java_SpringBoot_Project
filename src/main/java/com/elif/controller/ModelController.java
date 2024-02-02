package com.elif.controller;

import com.elif.entity.Brand;
import com.elif.entity.Model;
import com.elif.entity.Product;
import com.elif.service.ModelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.elif.utility.constants.RestApiUrls.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(MODEL)
public class ModelController {
    private final ModelService modelService;

    @GetMapping(GET_ALL)
    public ResponseEntity<List<Model>> findAll(){
        List<Model> modelList = modelService.findAll();
        if(modelList.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(modelList);
    }

    @GetMapping(ADD)
    public ResponseEntity<Model> save(@RequestBody Model model){
        return ResponseEntity.ok(modelService.save(model));
    }

    @GetMapping(GET_BY_ID)
    public ResponseEntity<Optional<Model>> findById(@PathVariable Long id){
        return ResponseEntity.ok(modelService.findById(id));
    }

}

