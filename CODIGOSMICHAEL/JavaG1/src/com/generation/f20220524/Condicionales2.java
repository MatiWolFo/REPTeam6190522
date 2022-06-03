package com.generation.f20220524;

import java.util.Scanner;

public class Condicionales2 {
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

        /*Scanner sc = new Scanner(System.in);

        //get entrada numerica user
        System.out.println("Ingrese su monto de venta");
        int montoventa = sc.nextInt();

        //variables comision1

        int montoComision5a = 10000;
        int montoComision4a = 9999;
        int montoComision4b = 5001;
        int montoComision3a = 4999;
        int montoComision3b = 1001;
        float factormultiplicatibo3 = 0.1f;
        float factormultiplicatibo2 = 0.2f;
        float factormultiplicatibo1 = 0.3f;


        //calcular comisiones


        float ventalTotal1;
        float ventalTotal2;
        float ventalTotal3;
        float ventalTotal4;


        if (montoventa >= montoComision5a) {

            ventalTotal1 = montoventa * factormultiplicatibo1;
            System.out.println(ventalTotal1);


        } else if (montoventa >= montoComision4b  && montoventa <= montoComision4a) {

            ventalTotal2 = montoventa * factormultiplicatibo2;
            System.out.println(ventalTotal2);

        } else if (montoventa >= montoComision3b && montoventa <= montoComision3a ) {

            ventalTotal3 = montoventa * factormultiplicatibo3;
            System.out.println(ventalTotal3);

        }else{

            System.out.println(montoventa);
        }*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edadingresada = sc.nextInt();

        int edadJoven = 15;
        int edadAdulto = 60;
        float descuento1 = 0.60f;
        float descuento2 = 0.55f;
        int ticket = 3500;
        int ventaticket1 = 0;


        if(edadingresada <= edadJoven){

            int descuentoticket = (int) (descuento1 * ticket);
            ventaticket1 = ticket - descuentoticket;

            System.out.println("Su descuento es de 60% el total de su venta es " + ventaticket1 + ".-");

        } else if (edadingresada > edadAdulto) {

            int descuentoticket = (int) (descuento2 * ticket);
            ventaticket1 = ticket - descuentoticket;

            System.out.println("Su descuento es de 55 % el total de su venta es " + ventaticket1 + ".-");
        }else{

            System.out.println(ticket);
            System.out.println("El total de su venta es " + ticket + ".-");

        }


    }
}

