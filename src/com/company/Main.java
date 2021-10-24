package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the expression: ");
        String expression = in.nextLine();
        String f = "f";


        while (expression.indexOf("f") == -1) {
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
            System.out.println("Enter 'f' if you want to exit.");
            System.out.println("If you want to continue calculating enter the expression:");
            expression = in.nextLine();
        }
    }
}
// Done - Пользователь вводит строку a (операция) b;
// Done - В зависимости от того, какую операцию ввел пользователь, работает метод того или иного наследника;
// Done - В результате выводится ответ выполнения операции;
// Done - Сделать так что бы программа работала циклично.

// Шемонаев Алексей Николаевич
//Отдельный лайк за метод getNums.
//Хорошая, лаконичная реализация!
//Рекомендации по коду:
// Вместо кучи if можно было воспользоваться switch case, так красивее и легче добавлять новые операции при их появлении.
//А так молодец!