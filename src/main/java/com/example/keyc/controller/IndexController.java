package com.example.keyc.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {

    @GetMapping(path = "/")
    public Map<String, String> index() {
        // get a successful user login
        OAuth2User user = ((OAuth2User)SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        return Map.of("hello", user.getAttribute("name"),"your email is", user.getAttribute("email"));
    }

    @GetMapping(path = "/unauthenticated")
    public HashMap unauthenticatedRequests() {
        return new HashMap(){{
            put("this is ", "unauthenticated endpoint");
        }};
    }
}