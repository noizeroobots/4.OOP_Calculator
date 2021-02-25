package com.company;

public class Division extends Operation {

    @Override
    public double execute(String expression, int i) {
        int[] result = getNums(expression, i);
        return(double) result[0] / result[1];
    }
}