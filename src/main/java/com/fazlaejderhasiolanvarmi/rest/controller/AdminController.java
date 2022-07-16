package com.fazlaejderhasiolanvarmi.rest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Value("${admin.username}")
    String adminUsername;

    @Value("${admin.pwd}")
    String adminPwd;

    @PostMapping
    public ResponseEntity<?> credentials(@RequestParam String username, @RequestParam String pwd){

        if(username.equals(adminUsername) && pwd.equals(adminPwd)){
            return new ResponseEntity<>("Success!", HttpStatus.I_AM_A_TEAPOT);
        }

        return new ResponseEntity("Wrong credentials.", HttpStatus.UNAUTHORIZED);
    }
}
