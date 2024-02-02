package com.elif.entity;

import com.elif.utility.enums.ECategory;
import com.elif.utility.enums.ESubCategory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_feature")
public class Feature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private ECategory category;
    @Enumerated(EnumType.STRING)
    private ESubCategory subcategory;

    @Column(length = 700)
    private String description;
    @Embedded
    BaseEntity baseEntity;


}
