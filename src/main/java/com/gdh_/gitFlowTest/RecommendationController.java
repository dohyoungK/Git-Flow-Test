package com.gdh_.gitFlowTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecommendationController {
    @GetMapping("/")
    public String helloWorld() {
        return "To-do Application";
    }
}
