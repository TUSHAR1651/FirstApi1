package com.example.demo.services;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {
    long id;
    String title;
    double price;
    String description;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
}
