package com.generation.f20220526;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //scanner
        Scanner sc = new Scanner(System.in);

        //variables int
        int valorInferior, valorSuperior, totalSuma = 0, numeros, contadorDentroRango = 0, contadorFueraRango = 0;

        // variables boolean
        boolean existe;

        // El "do" Se va hacer 1 vez, y mientras las condiciones del while sean verdaderas se volvera a repetir, desde el do
        do {
            //valores ingresados por usuario
            System.out.println("Escriba numero inferior: ");
            valorInferior = sc.nextInt();
            System.out.println("Escriba numero superior: ");
            valorSuperior = sc.nextInt();

            //validacion de numero inferior
            if (valorInferior > valorSuperior) {
                System.out.println("Incorrecto, debe ingresar un valor mayor al inferior");

                //validacion de numero 0
            } else if (valorInferior <= 0 || valorSuperior <= 0) {
                System.out.println("Debe ingresar un valor mayor a 0");
            }

            //Se va a repetir mientras sea Verdadero, si es falso sigue con el codigo, esto es para que vuelva al principio del "do"
        } while (valorInferior > valorSuperior || valorInferior <= 0 || valorSuperior <= 0);

        //El for parte del valorInferior hasta el valorSuperior, entonces va sumando los numeros del rango la variable acumuladora
        for (int i = valorInferior; i <= valorSuperior; i++) {
            totalSuma = totalSuma + i;//variable acumuladora

        }
        //La suma de los numeros que estan dentro del rango
        System.out.println("La suma del rango es: " + totalSuma);

        do {
            //Le pido al usuario nuevos numeros
            System.out.println("Ingrese numeros ");
            numeros = sc.nextInt();

            //Hago esta validacion para que al momento de digitar el 0, no me lo cuente como numero fuera del rango
            if (numeros != 0) {
                //Le doy valor false a la variable boolean, para que al momento de entrar al if recorra todos los valores hasta encontrar uno
                existe = false;
                for (int i = valorInferior; i <= valorSuperior; i++) {
                    if (numeros == i) {

                        existe = true;// Aqui, al momento de encontrar un numero le digo que es verdadero
                        break;// Al momento de encontrar el numero paro el ciclo for
                    }
                }

                //Entra al if, ya que existe el numero y la variable boolean "existe" esta en true
                if (existe) {
                    contadorDentroRango = contadorDentroRango + 1;//suma la cantidad de numeros dentro del rango, cuando es true
                } else {
                    contadorFueraRango = contadorFueraRango + 1;//suma la cantidad de numeros dentro del rango, cuando es false
                }
            }

        } while (numeros != 0);// mientras se cumpla esta condicion se va a volver a repetir, pero si le coloco el cero(0) se sale por ser falso y sigue el recorrido

        System.out.println("Los numeros fuera del rango son: " + contadorFueraRango);//muestro cantidad de numeros fuera del rango
        System.out.println("Los numeros dentro del rango son: " + contadorDentroRango);//muestro cantidad de numeros dentro del rango

    }
}