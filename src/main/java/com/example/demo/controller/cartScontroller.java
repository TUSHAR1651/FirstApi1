// package com.example.demo.controller;

// import com.example.demo.services.Cart;
// import com.example.demo.services.FakeStoreCartServices;
// import com.example.demo.services.ProductService;
// import com.example.demo.services.fakeStoreCartDto;

// import org.springframework.web.bind.annotation.*;

// import java.util.List;

// @RestController
// @RequestMapping("/api/carts")
// public class cartScontroller {

//     ProductService productservice = new ProductService();

    
//     @GetMapping("/dateRange")
//     public List<Cart> getAllCart(@RequestParam("startdate") String startDate, @RequestParam("enddate") String endDate) {
//         System.out.println(startDate + " " + endDate);
//         return fakeStoreCartServices.getCartInDateRange(startDate, endDate);
//     }

//     // Get Cart Item By Id
//     @GetMapping("/{id}")
//     public Cart getCart(@PathVariable Long id) {

//         return fakeStoreCartServices.getCart(id);
//     }


//     //Get User Cart

//     @GetMapping("/user/{userId}")
//     public List<Cart> getUserCarts(@PathVariable Long userId) {
//       return  fakeStoreCartServices.getUserCarts(userId);
//     }

//     // Add a new Product in Cart
//     @PostMapping(
//             value = "", consumes = "application/json", produces = "application/json")
//     public Cart createPerson(@RequestBody Cart cart) {
//         return fakeStoreCartServices.addNewCartProduct(cart);
//     }

//     // Update a Product in Cart
//     @PutMapping("/{id}")
//     public Cart updateCart(@PathVariable Long id) {
//         return fakeStoreCartServices.updateAProduct(id);
//     }

//     // Delete a Product from Cart
//     @DeleteMapping("/{id}")
//     public String deleteCart(@PathVariable Long id) {
//          fakeStoreCartServices.deleteCart(id);
//         return  "Product deleted successfully with "+ id;
//     }

// }