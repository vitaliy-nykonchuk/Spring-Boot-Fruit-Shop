package com.example.app.SpringBootWebShop.service.Admin;

import com.example.app.SpringBootWebShop.entity.StoneFruit;
import com.example.app.SpringBootWebShop.repository.StoneFruitRepository;
import com.example.app.SpringBootWebShop.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class AdminStoneFruitService {
    @Autowired
    StoneFruitRepository repository;

    public List<StoneFruit> getAll() {
        Iterable<StoneFruit> iterable = repository.findAll();
        List<StoneFruit> list =
                StreamSupport.stream(iterable.spliterator(), false)
                        .map(stoneFruit -> new StoneFruit(stoneFruit.getId(),
                                Constants.URL_IMAGES_UPLOADS + stoneFruit.getImg(),
                                stoneFruit.getName(),
                                stoneFruit.getArticle(),
                                stoneFruit.getDescr(),
                                stoneFruit.getPrice()))
                        .toList();
        return new ArrayList<>(list);
    }
}
