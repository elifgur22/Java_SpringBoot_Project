package com.elif.service;

import com.elif.entity.Image;
import com.elif.repository.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ImageService implements ICrudService<Image,Long> {

    private final ImageRepository imageRepository;

    @Override
    public Image save(Image image) {
        return imageRepository.save(image);
    }

    @Override
    public Image update(Image image) {
        return imageRepository.save(image);
    }

    @Override
    public Iterable<Image> saveAll(Iterable<Image> t) {
        return imageRepository.saveAll(t);
    }

    @Override
    public Image deleteById(Long id) {
        Optional<Image> optionalImage = imageRepository.findById(id);
        if(optionalImage.isPresent()){
            return imageRepository.save(optionalImage.get());
        }else{
            throw new NullPointerException("Image not found");
        }
    }

    @Override
    public Optional<Image> findById(Long id) {
        Optional<Image> image = imageRepository.findById(id);
        if (image.isPresent()) {
            return image;
        } else {
            throw new NullPointerException("Image not found");
        }
    }

    @Override
    public List<Image> findAll() {
        List<Image> imageList = imageRepository.findAll();
        if (imageList.isEmpty()) {
            throw new NullPointerException("List is empty.");
        }
        return imageList;
    }
}
