package com.haydikodlayalim.dpatterns.builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Run {

    public static void main(String[] args) {
        // Builder deseni ile sadece istenen alanlar esnek şekilde set edilir
        Product product1 = Product.builder()
                .id(1L)
                .name("Laptop")
                .price(new BigDecimal("25000"))
                .inStock(true)
                .date(LocalDateTime.now())
                .description("Yüksek performanslı dizüstü bilgisayar")
                .build();

        // Bazı alanları doldurmak zorunda kalmadan da nesne üretebiliriz
        Product product2 = Product.builder()
                .id(2L)
                .name("Kulaklık")
                .price(new BigDecimal("1500"))
                .build();

        System.out.println(product1);
        System.out.println(product2);
    }
}
