package com.example.app.SpringBootWebShop.service.User;

import com.example.app.SpringBootWebShop.entity.CitrusFruit;
import com.example.app.SpringBootWebShop.repository.CitrusFruitRepository;
import com.example.app.SpringBootWebShop.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class UserCitrusFruitService {
    @Autowired
    CitrusFruitRepository repository;

    public List<CitrusFruit> getAll() {
        Iterable<CitrusFruit> iterable = repository.findAll();
        List<CitrusFruit> list =
                StreamSupport.stream(iterable.spliterator(), false)
                        .map(citrusFruit -> new CitrusFruit(citrusFruit.getId(),
                                Constants.URL_IMAGES_UPLOADS + citrusFruit.getImg(),
                                citrusFruit.getName(),
                                citrusFruit.getArticle(),
                                citrusFruit.getDescr(),
                                citrusFruit.getPrice()))
                        .toList();
        return new ArrayList<>(list);
    }
}
