package com.example.itemmicroservice.repository;

import com.example.itemmicroservice.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository <Dog, Long> {
}
