package com.groupware.erp.market.model;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "market_discount")
public class MarketDiscountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int discount_no;
    private String discount_name;
    private int product_no;

    @Column(precision = 5, scale = 2) // DECIMAL(5,2)로 매핑
    private BigDecimal discount_rate; // 할인율 (백분율)

    private LocalDate start_date;
    private LocalDate end_date;
}
