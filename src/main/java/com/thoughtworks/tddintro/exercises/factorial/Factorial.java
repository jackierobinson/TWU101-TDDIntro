package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int i) {
        if(i < 0)
            throw new IllegalArgumentException();
        if(i <= 1)
            return 1;
       return i * (i-1);
    }
}
