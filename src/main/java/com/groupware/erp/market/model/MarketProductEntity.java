package com.groupware.erp.market.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "market_product")
public class MarketProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int product_no;
    private int category_no;
    private String name;
    private int price;
    private String img;
    private String description;
}
