package com.company;
import java.util.Scanner;
//solution to the problem: Cranes
public class Main3 {
    public static void main(String[] args){
        double x,pety, katya ,serega,cranes;

        Scanner input = new Scanner(System.in);

        System.out.print("Число журавликов: ");
        cranes = input.nextInt();

        x=cranes/6;
        pety=serega=x;
        katya=2*(pety+serega);
        cranes=pety+katya+serega;

        System.out.println("Pety " + pety+ "Katya " + katya+ "Serega " + serega );
    }
}
