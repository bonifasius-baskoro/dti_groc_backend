package com.bonbon.demo.cart;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/cart")
public class CartController {
    @GetMapping
    public String getCart(){
        return "product endpoint working!";
    }

    @GetMapping("/{id}")
    public String getCartByID(@PathVariable int id){
        return "Product Detail for ID :" + id;
    }
}
