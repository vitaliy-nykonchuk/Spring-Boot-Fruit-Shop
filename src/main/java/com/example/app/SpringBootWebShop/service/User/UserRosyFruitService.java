package com.example.app.SpringBootWebShop.service.User;

import com.example.app.SpringBootWebShop.entity.RosyFruit;
import com.example.app.SpringBootWebShop.repository.RosyFruitRepository;
import com.example.app.SpringBootWebShop.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class UserRosyFruitService {
    @Autowired
    RosyFruitRepository repository;

    public List<RosyFruit> getAll() {
        Iterable<RosyFruit> iterable = repository.findAll();
        List<RosyFruit> list =
                StreamSupport.stream(iterable.spliterator(), false)
                        .map(rosyFruit -> new RosyFruit(rosyFruit.getId(),
                                Constants.URL_IMAGES_UPLOADS + rosyFruit.getImg(),
                                rosyFruit.getName(),
                                rosyFruit.getArticle(),
                                rosyFruit.getDescr(),
                                rosyFruit.getPrice()))
                        .toList();
        return new ArrayList<>(list);
    }
}
