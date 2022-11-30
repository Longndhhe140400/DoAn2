package com.example.doan2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MarketController {
    @GetMapping("/shop")
    public String viewShop() {
        return "shop";
    }


    @GetMapping("/productDetail")
    public String viewProductDetail() {
        return "productDetail";
    }
<<<<<<< Updated upstream
//    @GetMapping("/myToad")
//    public String viewMyToadCategory() {
//        return "myToadCategory";
//    }

//    @GetMapping("/sellToad")
//    public String sellToad() {
//        return "sellToad";
//    }

=======

    // test commentsdsdsds
>>>>>>> Stashed changes
}
