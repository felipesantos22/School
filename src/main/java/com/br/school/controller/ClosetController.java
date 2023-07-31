package com.br.school.controller;

import com.br.school.entity.Closet;
import com.br.school.service.ClosetService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/closet")
public class ClosetController {
    private final ClosetService closetService;
    public ClosetController(ClosetService closetService) {
        this.closetService = closetService;
    }
    @PostMapping
    public ResponseEntity<Closet> createController(@RequestBody Closet closet) {
        Closet cst = closetService.createService(closet);
        return ResponseEntity.status(HttpStatus.CREATED).body(cst);
    }

    @GetMapping
    public ResponseEntity<List<Closet>> readController(){
        List<Closet> cst = closetService.readService();
        return ResponseEntity.ok().body(cst);
    }
}
