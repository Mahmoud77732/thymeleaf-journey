/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sbthymeleaf.step_02_variables_and_loops.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author mm887
 */
@Controller
public class UserController {

    @GetMapping("/users")
    public String users(Model model) {
        // Some mock data
        List<String> names = List.of("Mahmoud", "Ali", "Sara", "Fatma");
        model.addAttribute("names", names);
        model.addAttribute("showList", true);
        model.addAttribute("title", "User List Example");
        return "users"; // will load templates/users.html
    }
}
