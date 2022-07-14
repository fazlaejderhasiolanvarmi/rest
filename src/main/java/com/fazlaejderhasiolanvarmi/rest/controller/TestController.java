package com.fazlaejderhasiolanvarmi.rest.controller;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/formula")
public class TestController {
    //formula/driver?name=
    @GetMapping("/drivers")
    public ResponseEntity<?> getPilot(@RequestParam String name){

        if(name.equals("charles")){
            return ResponseEntity.ok().body("2022 World Champion!!");
        }else if(name.equals("latifi")){
            return new ResponseEntity("Latifi Çok Kaza Yapıyo", HttpStatus.PAYMENT_REQUIRED);
        }

        return ResponseEntity.badRequest().body("Bunlar Tırt");
    }

    @GetMapping("/teams/{name}")
    //formula/teams/name
    public ResponseEntity<?> getTeam(@PathVariable String name){
        if(name.equals("ferrari")){
            return ResponseEntity.ok().body("2022 Teams Champion!!");
        }

        return ResponseEntity.badRequest().body("Bunlar Tırt");
    }
}
