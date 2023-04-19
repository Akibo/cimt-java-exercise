package com.exercise.application.models;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class GcdInput {
    @NotNull @Min(0) @Max(2147483647)
    private Integer val1;

    @NotNull @Min(0) @Max(2147483647)
    private Integer val2;

    public int getVal1() {
        return val1;
    }

    public int getVal2() {
        return val2;
    }

}