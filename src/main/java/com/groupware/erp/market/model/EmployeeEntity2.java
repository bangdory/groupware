package com.groupware.erp.market.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "employee")
public class EmployeeEntity2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int emp_no;

    private String name;
    // 기타 필드들
}