package com.company;

import java.util.Scanner;
//не доделал((((
public class Main5 {
    public static void main(String[] args) {
        //на вход вводиться кол-во ворон (целое)
        //ваша программа должна выбрать правильное склонение
        //1-ворона, 10000001 - ворона
        //4-вороны, 584 - вороны
        //switch
        //1 - ворона
        //2,3,4 - вороны
        //0,5,6,7,8,9 - ворон

        Scanner input = new Scanner(System.in);
        int countOfRaven;

        System.out.print("сколько на поле прилетело ворон?: ");
        countOfRaven = input.nextInt();

        int lastDigit = countOfRaven % 10;


        switch (lastDigit) {
            case 1:
                if (countOfRaven == 1) {
                    lastDigit = countOfRaven % 10;
                    System.out.print("ворона");
                }
                else {
                    lastDigit = countOfRaven % 100;
                    System.out.print("ворон");
                }
                break;
            case 2:
                if (countOfRaven == 12) {
                    System.out.println("опа");
                }
                else {
                    System.out.print("вороны");
                }
                break;
            case 3:
                if (countOfRaven == 13) {
                    System.out.println("опа");
                }
                else {
                    System.out.print("вороны");
                }
                break;
            case 4:
                if (countOfRaven == 14) {
                    System.out.println("опа");
                }
                else {
                    System.out.print("вороны");
                }
                break;
            default:
                System.out.print("ворон");
                break;

        }

    }
}