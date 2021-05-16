package com.company;
import java.util.Scanner;

//the solution of the problem: Arithmetic
public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.println("Сравнить числа");

        System.out.print("Первое число: ");
        a = input.nextInt();
        System.out.print("Второе число: ");
        b = input.nextInt();
        System.out.print("Третье число: ");
        c = input.nextInt();

        if (a * b == c) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
