package com.elif.controller;
import com.elif.entity.Image;
import com.elif.service.CloudinaryService;
import com.elif.service.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

import static com.elif.utility.constants.RestApiUrls.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(IMAGE)
public class ImageController {
    private final ImageService imageService;
    private final CloudinaryService cloudinaryService;

    @PostMapping(value = UPLOAD, consumes = "multipart/form-data")
    public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file) {
        try {
            // Cloudinary'e dosyayı yükle ve dönen URL'yi al
            String imageUrl = cloudinaryService.uploadFile(file);

            imageService.save(Image.builder()
                    .imageUrl(imageUrl)
                    .build());

            return ResponseEntity.ok("Resim başarıyla yüklendi. URL: " + imageUrl);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body("Resim yükleme hatası.");
        }
    }



}
