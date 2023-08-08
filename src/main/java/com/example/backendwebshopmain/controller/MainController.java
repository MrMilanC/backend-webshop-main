package com.example.backendwebshopmain.controller;

import com.example.backendwebshopmain.security.principal.UserPrincipal;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {

    @GetMapping("/main")
    public String greeting(){
        return "Hello, World!";
    }

    @GetMapping("/secured")
    public String secured(@AuthenticationPrincipal UserPrincipal principal){
        return "You're in as user: " + principal.getUsername() + " User ID: " + principal.getUserId() + "passwort" + principal.getPassword();
    }

    @GetMapping("/admin")
    public String admin (@AuthenticationPrincipal UserPrincipal principal){
        return "Hier is Admin" + principal.getUserId();
    }
}
