package com.exercise.application.controllers;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exercise.application.models.GcdInput;
import com.exercise.application.services.GcdService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class GcdController {

    private final GcdService gcdService;

    public GcdController(GcdService gcdService) {
        this.gcdService = gcdService;
    }

    @PostMapping("/gcd")
    public int getGcd(@Valid @RequestBody GcdInput gcdInput) {
        return gcdService.calculateGcd(gcdInput.getVal1(), gcdInput.getVal2());
    }
}
