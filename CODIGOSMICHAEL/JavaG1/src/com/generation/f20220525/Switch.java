package com.generation.f20220525;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        //menu

        System.out.println("Ingrese opcion:");
        System.out.println("1 Mayores de 70 años > \n 2 Entre 50 y 69 años \n 3 Entre 30 y 49 años \n 4 Menor de 30 años");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();

        //Caso de error1 :Numeros negativos********IMPORTANTE**********
        //Caso de error2 :Personas que vivan mas de 100 años

        switch (edad) {
            case 1://Opcion para mayores de 70 años
                //accion para la opcion 1

                int adultoMayor1 = 500;
                System.out.println("Adulto Mayor");


                break;
            case 2://Opcion para 50 - 69 años

                int adulto = 400;
                System.out.println("Adulto");

                break;

            case 3://Opcion para 30 - 49 años

                int adultoJoven = 250;
                System.out.println("Adulto Joven");

                break;
            case 4://Opcion para menos de 29

                int jovenAdulto = 100;
                System.out.println("Joven Adulto");
                break;

            default:
                break;


        }
        System.out.println("Fuera del switch");
    }

}