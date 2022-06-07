package com.generation.f20220526;

import java.util.Scanner;

public class FuncionesCalculadora {

    public static void main(String[] args) {
        //import scanner
        Scanner sc = new Scanner(System.in);
        //offer menu and options
        System.out.println("Choose an option:");
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        //get user's choice
        int userOption = sc.nextInt();
        //
        switch (userOption) {
            case 1:
                /*public static void sumaCalculo;(int num1, int num2);
                System.out.println();
                num1 = sc.nextInt();
                System.out.println();
                num2 = sc.nextInt();
                int totalSuma = num1 + num2;*/

                System.out.println("** Addition");
                break;
            case 2:
                //execute action 2
                System.out.println("** Subtraction");
                break;
            case 3:
                //execute action 3
                System.out.println("** Multiplication");
                break;
            case 4:
                //execute action 4
                System.out.println("** Division");
                break;
            default:
                System.out.println("Not valid option. Please chose a valid one.");
                break;
        }
    }
}
