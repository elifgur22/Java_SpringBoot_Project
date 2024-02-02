package com.elif.controller;
import com.elif.entity.Brand;
import com.elif.entity.Feature;
import com.elif.service.FeatureService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.elif.utility.constants.RestApiUrls.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(FEATURE)
public class FeatureController {
    private final FeatureService featureService;

    @GetMapping(ADD)
    public ResponseEntity<Feature> save(@RequestBody Feature feature){
        return ResponseEntity.ok(featureService.save(feature));
    }

    @GetMapping(GET_BY_ID)
    public ResponseEntity<Optional<Feature>> findById(@PathVariable Long id){
        return ResponseEntity.ok(featureService.findById(id));
    }

    @GetMapping(GET_ALL)
    public ResponseEntity<List<Feature>> getAllFeatures() {
        List<Feature> allFeatures = featureService.findAll();
        return ResponseEntity.ok(allFeatures);
    }
}
