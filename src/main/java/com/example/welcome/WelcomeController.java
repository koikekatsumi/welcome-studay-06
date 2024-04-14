package com.example.welcome;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
@GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }
    @DeleteMapping("/welcome")
    public String deleteWelcome(){
    return "delete welcome";
    }
}
