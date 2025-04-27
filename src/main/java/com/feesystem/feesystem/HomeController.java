package com.feesystem.feesystem;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "forward:/index.html";
    }

    @GetMapping("/admin")
    public String admin() {
        return "forward:/adminDashboard.html";
    }

    @GetMapping("/guardian")
    public String guardian() {
        return "forward:/guadianDashboar.html";
    }

    @GetMapping("/student")
    public String student() {
        return "forward:/studentDasboard.html";
    }
}
