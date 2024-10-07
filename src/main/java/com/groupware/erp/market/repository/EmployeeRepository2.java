package com.groupware.erp.market.repository;

import com.groupware.erp.market.model.EmployeeEntity2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository2 extends JpaRepository<EmployeeEntity2, Integer> {
}
