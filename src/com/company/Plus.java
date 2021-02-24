package com.company;

public class Plus extends Operation {

    @Override
    public double execute(String expression, int i) {
        int[] result = getNums(expression, i);
        return result[0] + result[1];
    }
}
