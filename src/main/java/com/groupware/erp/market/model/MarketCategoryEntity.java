package com.groupware.erp.market.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "market_category")
public class MarketCategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int category_no;
    private String category_name;
    private int order_no;
}
