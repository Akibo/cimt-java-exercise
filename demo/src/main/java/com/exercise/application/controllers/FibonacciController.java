package com.exercise.application.controllers;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exercise.application.services.FibonacciService;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

@RestController()
@RequestMapping("/api")
@Validated
public class FibonacciController {

    private final FibonacciService fibonacciService;

    public FibonacciController(FibonacciService fibonacciService) {
        this.fibonacciService = fibonacciService;
    }

    @GetMapping("/fibonacci")
    public long getFibonacci(@RequestParam("n") @Min(0) @Max(90) long n) {
        return fibonacciService.calculateNthFibonacciNumber(n);
    }

}