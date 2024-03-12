package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.FakeStoreProductDto;
import com.example.demo.services.ProductService;
import com.example.demo.services.fakeStoreCartDto;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;





@RequestMapping
@RestController
public class ProductController {
    ProductService ps;

    ProductController(ProductService ps){
        this.ps = ps;
    }

    @GetMapping("/products/")
    public FakeStoreProductDto getAllproducts() {
        return ps.getAllProducts();
    }

    @GetMapping("/products/{id}/")
    public FakeStoreProductDto getProductById(@PathVariable Long id) {
        return ps.getProductById(id);
    }
    @PostMapping("/carts/")
    public fakeStoreCartDto addCart(@RequestBody fakeStoreCartDto cart) {
        return ps.addNewCart(cart);
    }
    
    
    
    @GetMapping("/carts/user/{id}/")
    public fakeStoreCartDto getMethodName(@PathVariable long id) {
        return ps.getCartById(id);
    }
    
    
    
}
