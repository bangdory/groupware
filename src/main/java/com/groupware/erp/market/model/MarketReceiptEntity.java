package com.groupware.erp.market.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "market_receipt")
public class MarketReceiptEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int receipt_no;
    private int emp_no;
    private int total_price;
    private LocalDate payment_date;

}
