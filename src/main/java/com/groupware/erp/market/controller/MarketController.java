package com.groupware.erp.market.controller;

import com.groupware.erp.market.model.MarketCategoryEntity;
import com.groupware.erp.market.model.MarketProductEntity;
import com.groupware.erp.market.model.ProductWithDiscountDTO;
import com.groupware.erp.market.service.MarketCartService;
import com.groupware.erp.market.service.MarketProductService;
import com.groupware.erp.market.service.MarketCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/market")
public class MarketController {
    @Autowired
    private MarketCategoryService marketCategoryService;
    @Autowired
    private MarketProductService marketProductService;

    // 카테고리 불러오기
    @GetMapping
    public List<MarketCategoryEntity> findAll() {
        return marketCategoryService.findAll();
    }

    // 카테고리에 따른 상품 불러오기
    @GetMapping("/category/{categoryNo}")
    public List<ProductWithDiscountDTO> getProductsByCategory(@PathVariable int categoryNo) {
        return marketProductService.findProductsByCategory(categoryNo);
    }

    // 개별 상품 불러오기
    @GetMapping("/product/{productNo}")
    public ProductWithDiscountDTO getProductByProductNo(@PathVariable int productNo) {
        return marketProductService.findProductByProductNo(productNo);
    }


}
