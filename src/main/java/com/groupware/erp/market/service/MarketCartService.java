package com.groupware.erp.market.service;

import com.groupware.erp.market.model.EmployeeEntity2;
import com.groupware.erp.market.model.MarketCartEntity;
import com.groupware.erp.market.repository.EmployeeRepository2;
import com.groupware.erp.market.repository.MarketCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketCartService {

    @Autowired
    private MarketCartRepository marketCartRepository;

    @Autowired
    private EmployeeRepository2 employeeRepository;

    //카트 불러오기
    public List<MarketCartEntity> getCart(int empNo) {
        return marketCartRepository.findAll(empNo);
    }


    //카트에 등록
    public MarketCartEntity addToCart(int empNo, int productNo) {
        EmployeeEntity2 employee = employeeRepository.findById(empNo).orElseThrow(() -> new RuntimeException("Employee not found"));

        MarketCartEntity cart = new MarketCartEntity();
        cart.setEmployee(employee);
        cart.setProduct_no(productNo);

        return marketCartRepository.save(cart);
    }
    //카트 삭제
    public void deleteCartItem(int empNo, int productNo) {
        marketCartRepository.deleteByEmployee_EmpNoAndProduct_no(empNo, productNo);
    }

}

