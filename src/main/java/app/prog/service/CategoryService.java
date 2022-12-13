package app.prog.service;

import app.prog.model.CategoryEntity;
import app.prog.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryService {
    private final CategoryRepository repository;

    public List<CategoryEntity> getAll(){
        return repository.findAll();
    }

    public List<CategoryEntity> createCategory(List<CategoryEntity> toCreate){
        return repository.saveAll(toCreate);
    }
    public List<CategoryEntity> updateCategory(List<CategoryEntity> toUpdate){
        return repository.saveAll(toUpdate);
    }
}
