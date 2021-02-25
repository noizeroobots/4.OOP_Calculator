package com.company;

//written by Aleksey Dolgov
//written on 25.02.2021

public abstract class Operation {
    protected int[] getNums(String expression, int i) {
        String left = expression.substring(0, i);
        String right = expression.substring(i + 1, expression.length());

        int[] num = new int[2];
        num[0] = Integer.parseInt(left);
        num[1] = Integer.parseInt(right);
        return num;
    }

    public abstract double execute(String expression, int i);

}
