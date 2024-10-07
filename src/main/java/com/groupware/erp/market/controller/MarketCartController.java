package com.groupware.erp.market.controller;

import com.groupware.erp.market.model.EmployeeEntity2;
import com.groupware.erp.market.model.MarketCartEntity;
import com.groupware.erp.market.service.MarketCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/market/cart")
public class MarketCartController {
    @Autowired
    private MarketCartService marketCartService;

    //카트 불러오기
    @GetMapping("/read")
    public ResponseEntity<List<MarketCartEntity>> getCart(@RequestParam int empNo) {
        List<MarketCartEntity> cartItems = marketCartService.getCart(empNo);
        return ResponseEntity.ok(cartItems);
    }

    //카트 항목 삭제
    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteCartItem(@RequestParam int empNo, @RequestParam int productNo) {
        marketCartService.deleteCartItem(empNo, productNo);
        return ResponseEntity.ok("Cart item deleted successfully.");
    }

    //카트 항목 등록
    @PutMapping("/update")
    public ResponseEntity<MarketCartEntity> addToCart(@RequestParam int empNo, @RequestParam int productNo) {
        // 카트에 새로운 항목을 추가하고 그 결과를 반환받습니다.
        MarketCartEntity addedCart = marketCartService.addToCart(empNo, productNo);

        return ResponseEntity.ok(addedCart);
    }
}
