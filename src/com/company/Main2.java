package com.company;

import java.util.Scanner;
//solution to the problem: cake
public class Main2 {
    public static void main(String[] args){
        int guests;//число гостей
        Scanner input = new Scanner(System.in);

        System.out.print("Гостей: ");
        guests = input.nextInt();

        int min = guests % 10 ;

        if(min==2){
            System.out.print("1 разрез");
        }
        else{
            System.out.print("Кол-во разрезов " + guests);
        }
    }
}

