package com.example.app.SpringBootWebShop.repository;

import com.example.app.SpringBootWebShop.entity.RosyFruit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RosyFruitRepository extends CrudRepository<RosyFruit, Long> {
    List<RosyFruit> findAll();
}
