package com.example.app.SpringBootWebShop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "citrus_fruits")
public class CitrusFruit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;
    @Column(name = "img")
    String img;
    @Column(name = "name")
    String name;
    @Column(name = "article")
    String article;
    @Column(name = "description")
    String descr;
    @Column(name = "price")
    Double price;
}
