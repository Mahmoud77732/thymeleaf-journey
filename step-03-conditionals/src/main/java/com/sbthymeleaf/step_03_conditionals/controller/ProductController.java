/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sbthymeleaf.step_03_conditionals.controller;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author mm887
 */
@Controller
public class ProductController {

    @GetMapping("/products")
    public String products(Model model) {
        List<Map<String, Object>> products = List.of(
            Map.of("name", "Laptop", "price", 1200, "inStock", true),
            Map.of("name", "Phone", "price", 800, "inStock", false),
            Map.of("name", "Tablet", "price", 500, "inStock", true)
        );
        model.addAttribute("products", products);
        return "products";
    }
}
