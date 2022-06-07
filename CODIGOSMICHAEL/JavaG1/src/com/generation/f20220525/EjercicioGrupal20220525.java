package com.generation.f20220525;

import java.util.Scanner;

public class EjercicioGrupal20220525 {
    public static void main(String[] args) {

        //Necesitamos saber valorInferior y valorSuperior***HECHO***
        //Si valorInferior<valorSuperior continuar loop y si no preguntar nuevamente***HECHO***
        //Si numero = 0 terminar pidiendo numeros***HECHO***
        //Cuando termine programa necesitamos la suma de los numeros del loop****HECHO****
        //Cuando termine el programa necesitamos saber que numeros ingresados son iguales a los valores inferior y superior???
        //Cuantos numeros estan fuera del rango---Que se refiere con esto?---Ya lo entiendo y esta ***HECHO***


        Scanner sc = new Scanner(System.in);

        int totalSuma = 0;
        int contadorLoops = 0;
        int contadorDentro = 0;
        int contadorFuera = 0;
        int contadorIgualdades = 0;


        System.out.println("Porfavor ingrese el valor maximo de su rango");
        int valorSuperior = sc.nextInt();
        System.out.println("Porfavor ingrese el valor minimo de su rango");
        int valorInferior = sc.nextInt();
        int numero = 1; // El numero inicial se reemplaza solo importa que no sea 0

        while (valorInferior > valorSuperior) {

            System.out.println("\nSu valor maximo no puede ser menor que su valor minimo\n");
            System.out.println("Porfavor ingrese el valor maximo de su rango");
            valorSuperior = sc.nextInt();
            System.out.println("Porfavor ingrese el valor minimo de su rango");
            valorInferior = sc.nextInt();


        }while (numero != 0) {

                System.out.println("Ingrese un numero");
                numero = sc.nextInt();
                totalSuma = totalSuma + numero;
                contadorLoops++;

                if(numero !=0 && numero <= valorSuperior && numero >= valorInferior)

                contadorDentro++;

                if(numero !=0 && numero > valorSuperior || numero < valorInferior)

                contadorFuera++;

                if(numero == valorSuperior || numero == valorInferior)//No estoy seguro si se refiere contar igualdades con la cantidad de numeros ingresados

                contadorIgualdades++;

                if (numero == 0)
                    break;


            }
            System.out.println("El total de los numeros ingresados es: " + totalSuma+".");
            System.out.println("Se ingresaron " + contadorLoops + " valor(es).");
            System.out.println(contadorDentro + " valores estan dentro del rango.");
            System.out.println(contadorFuera  + " valores estan fuera del rango.");
            System.out.println("Se ingresaron numeros iguales a los valores minimo o maximo "+ contadorIgualdades+ " veces.");



        }
    }
