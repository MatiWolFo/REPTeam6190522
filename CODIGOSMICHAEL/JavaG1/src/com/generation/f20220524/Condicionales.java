package com.generation.f20220524;

import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        //Capturar el ingreso por consola
        /*Scanner sc = new Scanner(System.in);

        int Mayoriaedad = 18;

        //solicitar el ingreso de edad
        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();

        if(edad >= Mayoriaedad){

        System.out.println("INGRESE");

        }else{
         System.out.println("PA FUERA");
        }*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido = sc.nextLine();
        System.out.println("Ingrese su direccion");
        String direccion = sc.nextLine();
        System.out.println("Ingrese su numero de casa");
        int numeroCasa = sc.nextInt();


        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();
        int Mayoriaedad = 18;

        if (edad >= Mayoriaedad) {

            System.out.println("Bienvenido!");

            System.out.println("\nIngrese su saldo");
            int saldo = sc.nextInt();

            int minapuesta = 10000;
            int minsaldo = 50000;

            if (saldo >= minsaldo) {

                System.out.println("Apueste lo que quiera");
                System.out.println("\nIngrese su apuesta, la minima apuesta hoy es de 10000");
                int apuesta = sc.nextInt();

                if (apuesta > minapuesta && saldo>=apuesta) {

                    System.out.println("Disfrute su partida");

                } else {
                    System.out.println("Porfavor ingrese un saldo mayor a la apuesta minima de hoy y igual o menor a su saldo");

                }
            }else{
                    System.out.println("PA FUERA");

            }

        }
    }
}