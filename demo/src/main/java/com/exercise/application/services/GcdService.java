package com.exercise.application.services;

import org.springframework.stereotype.Service;

@Service
public class GcdService {
    public int calculateGcd(int num1, int num2) {

        if (num1 == 0 && num2 > 0) {
            return num1;
        }

        // Euclidean Algorithm to get the gcd
        // O(Log min(n1, n2))
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        return num1;
    }
}


