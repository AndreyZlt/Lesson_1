package com.company;

import java.util.Scanner;

public class Lesson_1 {
    public static void main(String[] args) {
        // Написать метод, принимающий на вход два целых числа и проверяющий,
        // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
        Scanner num = new Scanner(System.in);
        int num1, num2, result;
        System.out.println("Enter a: ");
        num1 = num.nextInt();
        System.out.println("Enter b: ");
        num2 = num.nextInt();
        result = num1 + num2;
        if (result >= 10 && result <= 20) {
            System.out.println("Cумма лежит в пределах от 10 до 20 (включительно) и равна = " + result );
        }
    }
}