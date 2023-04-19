package com.exercise.application.services;

import org.springframework.stereotype.Service;

@Service
public class FibonacciService {

    public long calculateNthFibonacciNumber(long n) {

        // iterative solution with for loop
        // O(n)
        long previousFib = 0;
        long currentFib = 1;

        for (int i = 0; i < n; i++) {
            long nextFib = previousFib + currentFib;
            previousFib = currentFib;
            currentFib = nextFib;
        }

        return currentFib;
    }
}
