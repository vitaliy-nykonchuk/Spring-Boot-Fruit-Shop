package com.example.app.SpringBootWebShop.repository;

import com.example.app.SpringBootWebShop.entity.StoneFruit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoneFruitRepository extends CrudRepository<StoneFruit, Long>{
    List<StoneFruit> findAll();
}
