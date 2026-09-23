package com.haydikodlayalim.dpatterns.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private long id;
    private String name;
    private BigDecimal price;
    private LocalDateTime date;
    private boolean inStock;
    private String description;

}
