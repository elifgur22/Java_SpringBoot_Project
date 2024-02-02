package com.elif.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private Long brandId;
    private Long modelId;
    private Long stock;
    @Embedded
    BaseEntity baseEntity;

    @ElementCollection
    private List<Long> images;
    @Column(length = 500)
    private String description;

}
