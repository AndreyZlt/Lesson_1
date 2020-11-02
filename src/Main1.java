package com.company;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        // 3.Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        // где a, b, c, d – аргументы этого метода, имеющие тип float.
        Scanner num = new Scanner(System.in);
        float a, b, c, d, result;
        System.out.println("Enter a: " );
        a = num.nextFloat();
        System.out.println("Enter b: " );
        b = num.nextFloat();
        System.out.println("Enter c: " );
        c = num.nextFloat();
        System.out.println("Enter d: " );
        d = num.nextFloat();
        result = a * (b + (c / d)) ;
        System.out.println("result is =" + result);
    }
}