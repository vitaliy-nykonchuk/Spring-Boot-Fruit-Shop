package com.example.app.SpringBootWebShop.repository;

import com.example.app.SpringBootWebShop.entity.CitrusFruit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CitrusFruitRepository extends CrudRepository<CitrusFruit, Long> {
    List<CitrusFruit> findAll();
}
