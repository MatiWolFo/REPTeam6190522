package com.generation.f20220525;

import java.util.Scanner;

public class BucleWhile {
    public static void main(String[] args) {

        /*System.out.println("Ingrese opcion:");
        System.out.println("1 Sumar \n 2 Restar \n 3 Multiplicar \n 4 Dividir");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();         */
        Scanner sc = new Scanner(System.in);

        System.out.println("(0) salir \n (1) sumar \n (2) restar \n (3) multiplicar \n (4) dividir");
        int opcion = sc.nextInt();//capturando el ingreso por consola

        /**VALIDAR EL INGRESO ERRONEO DE LA OPCION**/

        //while valida que la condicion sea verdadera
        while(opcion < 0 || opcion > 4) { // V i V = V

            System.out.println("(0) salir \n (1) sumar \n (2) restar \n (3) multiplicar \n (4) dividir");
            opcion = sc.nextInt();
                }
        boolean errorIngreso = false;

        if(opcion < 0 || opcion > 4) {
            errorIngreso = true;
        }

        /**VALIDAR EL INGRESO ERRONEO DE LA OPCION**/

        while(errorIngreso) { // V i V = V

            System.out.println("(0) salir \n (1) sumar \n (2) restar \n (3) multiplicar \n (4) dividir");
            opcion = sc.nextInt();
            if(opcion < 0 || opcion > 4) {
                errorIngreso = true;
            }else {
                errorIngreso= false;
            }
        }

        System.out.println(" fuera del while");

        switch (opcion) {
            case 1:// sumar
                        // accion para la opcion 1
                System.out.println("** Suma");
                break;

            case 2:

                System.out.println("** Resta");
                break;
            case 3:
                System.out.println("** Multiplicacion");
                break;
            case 4:// division
                System.out.println("** Division");
                break;
            default:
                System.out.println("opcion invalida");
                break;
                }
            }



}

