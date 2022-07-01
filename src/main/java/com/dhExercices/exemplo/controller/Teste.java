package com.dhExercices.exemplo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teste")
public class Teste {

    @GetMapping("olá/{nome}")
    public String digitaHello(@PathVariable String nome){
        return "Ola " + nome;
    }

    @GetMapping("/olá")
    public String  digaHello(@RequestParam String nome, @RequestParam int id){
        return "Ola " + nome + ": " + id;
    }

    @PostMapping
    public ResponseEntity<User> getUser(@RequestBody User user){
       if (user.getId() == 123){
           return new ResponseEntity<>(user, HttpStatus.OK);
       }
        return new ResponseEntity<>(user, HttpStatus.BAD_REQUEST);
    }
}
