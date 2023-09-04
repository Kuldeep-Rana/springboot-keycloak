package com.example.keyc.controller;

//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.oauth2.core.user.OAuth2User;

import com.example.keyc.service.ThirdPartyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class IndexController {
private final ThirdPartyService service;
   /* @GetMapping(path = "/")
    public Map<String, String> index() {
        // get a successful user login
        OAuth2User user = ((OAuth2User)SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        return Map.of("hello", user.getAttribute("name"),"your email is", user.getAttribute("email"));
    }*/

    @GetMapping(path = "/health")
    public Map health() throws UnknownHostException {
        return Map.of("host",InetAddress.getLocalHost().getHostAddress());

        //return service.call();

    }
}