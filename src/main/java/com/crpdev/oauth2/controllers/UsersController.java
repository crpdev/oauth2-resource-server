package com.crpdev.oauth2.controllers;

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
@RequestMapping("/users")
public class UsersController {

    @GetMapping("/status")
    public String status(){
        return "Success";
    }
}
