package com.company;
import java.util.Scanner;
//solution to the problem: Collecting strawberries
public class Main4 {
    public static void main(String[] args){
        int masha, misha, eaten, sum;
        Scanner input = new Scanner(System.in);

        System.out.print("Маша: ");
        masha = input.nextInt();
        System.out.print("Миша: ");
        misha = input.nextInt();
        System.out.print("Сколько съели: ");
        eaten = input.nextInt();

        sum= masha+misha-eaten;
        if (sum >= eaten) {
            System.out.println("Sum " + sum);
        }
        else if(masha == misha){
            System.out.println("Equal = 0 ");
        }
        else {
            System.out.println("Impossible");
        }
    }
}