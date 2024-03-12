package com.example.demo.services;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class fakeStoreCartDto {
    long id;
    long UserId;
    String date;
    FakeStoreProductDto[] arr;

    public FakeStoreProductDto[] getproduct(){
        return arr;
    }
    public void setProduct(FakeStoreProductDto[] arr){
        this.arr = arr;
    }
    public void setId(long id){
        this.id = id;
    }
    public long getId(){
        return id;
    }
    public void setCartId(long UserId){
        this.UserId = UserId;
    }
    public long getCartId(){
        return UserId;
    }
}
