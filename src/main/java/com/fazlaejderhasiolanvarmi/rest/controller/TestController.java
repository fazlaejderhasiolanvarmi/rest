package com.fazlaejderhasiolanvarmi.rest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/formula")
public class TestController {
    //formula/driver?name=
    @GetMapping("/driver")
    public ResponseEntity<?> getPilot(@RequestParam String name){

        if(name.equals("Charles")){
            return ResponseEntity.ok().body("2022 World Champion!!");
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
