package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input expression: ");
        String expression = in.nextLine();
        while (expression != "f") {
            for (int i = 0; i < expression.length(); i++) {
                if (expression.charAt(i) == '+') {
                    Plus s = new Plus();
                    System.out.println(s.execute(expression, i));
                }
                if (expression.charAt(i) == '-') {
                    Minus s = new Minus();
                    System.out.println(s.execute(expression, i));
                }
                if (expression.charAt(i) == '*') {
                    Multiplication s = new Multiplication();
                    System.out.println(s.execute(expression, i));
                }
                if (expression.charAt(i) == '/') {
                    Division s = new Division();
                    System.out.println(s.execute(expression, i));
                }
            }
            expression = "f";
//            expression = in.nextLine();

        }
;
    }

}
