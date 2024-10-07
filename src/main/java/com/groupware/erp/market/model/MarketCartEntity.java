package com.groupware.erp.market.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "market_cart")
public class MarketCartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int no;

    @ManyToOne
    @JoinColumn(name = "emp_no", referencedColumnName = "emp_no")
    private EmployeeEntity2 employee;
    private int product_no;

}
