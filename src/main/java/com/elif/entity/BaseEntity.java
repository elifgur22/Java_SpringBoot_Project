package com.elif.entity;

import com.elif.utility.enums.EState;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class BaseEntity {

    @Enumerated
    EState state;
    Long createAt;
    Long updateAt;
}
