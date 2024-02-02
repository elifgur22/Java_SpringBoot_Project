package com.elif.service;

import com.elif.entity.Model;
import com.elif.repository.ModelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ModelService implements ICrudService<Model,Long> {

    private final ModelRepository modelRepository;
    @Override
    public Model save(Model model) {
        return modelRepository.save(model);
    }

    @Override
    public Model update(Model model) {
        return modelRepository.save(model);
    }

    @Override
    public Iterable<Model> saveAll(Iterable<Model> t) {
        return modelRepository.saveAll(t);
    }

    @Override
    public Model deleteById(Long id) {
        Optional<Model> optionalModel = modelRepository.findById(id);
        if(optionalModel.isPresent()){
            return modelRepository.save(optionalModel.get());
        }else{
            throw new NullPointerException("Model not found");
        }
    }

    @Override
    public Optional<Model> findById(Long id) {
        Optional<Model> model = modelRepository.findById(id);
        if (model.isPresent()) {
            return model;
        }else {
            throw new NullPointerException("Model not found");
        }
    }

    @Override
    public List<Model> findAll() {
        List<Model> modelList= modelRepository.findAll();
        if(modelList.isEmpty()){
            throw new NullPointerException("List is empty.");
        }
        return modelList;
    }
}
