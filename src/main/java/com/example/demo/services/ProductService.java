package com.example.demo.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ProductService {

    RestTemplate restTemplate = new RestTemplate();
    String url = "https://fakestoreapi.com/";
    public FakeStoreProductDto getAllProducts(){
        var res = restTemplate.getForObject(url+"/products/", FakeStoreProductDto.class);
        return res;
    }
    public FakeStoreProductDto getProductById(long id){
        var Response = restTemplate.getForObject(url + "/products/" + id , FakeStoreProductDto.class);
        return Response;
        // return "Product from Service with id: " + id;
    }
    public fakeStoreCartDto getcart(){
        var response = restTemplate.getForObject(url +"/carts/", fakeStoreCartDto.class);
        return response;
    }
    public fakeStoreCartDto getCartById(long id){
        var response = restTemplate.getForObject(url +"/carts/user/" + id, fakeStoreCartDto.class);
        return response;
    }
    public fakeStoreCartDto addNewCart(fakeStoreCartDto cart){
        fakeStoreCartDto sendCart = mapToCardDTOs(cart);
           sendCart = restTemplate.postForObject(url, sendCart, fakeStoreCartDto.class);

        return mapToCart(sendCart);
    }
    private fakeStoreCartDto mapToCardDTOs(fakeStoreCartDto cart) {

        return new fakeStoreCartDto();

    }
    private fakeStoreCartDto mapToCart(fakeStoreCartDto recivedCartDTO) {

        return new fakeStoreCartDto();
    }
}
