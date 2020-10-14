package com.crpdev.oauth2.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rajapandian
 * Date: 14/10/20
 * Project: oauth2-ws
 * Package: com.crpdev.oauth2.controllers
 **/
@RestController
@RequestMapping("/token")
public class TokenController {

    @GetMapping
    public Jwt token(@AuthenticationPrincipal Jwt jwt){
        return jwt;
    }
}
