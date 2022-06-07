package com.generation.f20220526;

import java.util.Random;


public class Funciones {
    public static void main(String[] args) {
        /*//Funciones
        //4 tipos de funciones
        //2 que retornan y 2 que no van a retornar
        saludos();//llamado al metodo
        calculoSumaPares(true, 23, "22");
        int edad = obtenerEdad();
        Boolean mayor = validarMayorEdad(edad);

    }
    //accesador---->tipo de retorno---->nombre de la funcion---->definir parametros
    //funciones de tipo void no retornan nada, solo ejecutan codigo
    //nombre de la funcion se escriben con minuscula la primera letra

    public static void calculoSumaPares(boolean verdad, int numero, String numero2){
        System.out.println(numero);

    }

    //static nos permite acceder al metodo
    public static void saludos(){
          //solicitar ingreso de datos
        System.out.println("Buen dia");

    }
    //funciones que retornan un tipo de dato
    //aunque llame la funcion tengo que usar sout para imprimir lo que esta adentro
    public static Integer obtenerEdad(){
        Integer edad = 18;

        return edad;
    }

    //funcion que retorna un tipo de dato
    public static Boolean validarMayorEdad(Integer edad) {

        if(edad >= 18) {
            System.out.println("Es mayor de edad");
            return true;
        }else {
            System.out.println("Es menor de edad");
            return false;
        }
    }*/


        //Math

        double num1 = 12;
        double num2 = 5;
        double div = num1/num2;


        //Elevar o potencia
        double numeroElevado = Math.pow(div, 3);
        System.out.println(numeroElevado);

        //Redondear al entero mayor
        double EnteroMayor= Math.ceil(numeroElevado);
        System.out.println(EnteroMayor);

        //Redondear al entero menor
        double EnteroMenor = Math.floor(numeroElevado);
        System.out.println(EnteroMenor);

        //Entero redondeado
        double EnteroRedondeo = Math.round(numeroElevado);
        System.out.println(EnteroRedondeo);

        //Numero aleatorio entre 0.0 y  < 1.0
        double aleatorio = Math.random();
        System.out.println(aleatorio);

        double num10 = Math.random() * 10;
        System.out.println(num10);

        double num28= (Math.random() * 100)-99;
        System.out.println(num28);

        //numero aleatorio entre -4 y 4
        double num44 = (Math.random() * -4) +4;
        System.out.println(num44);

        //numero aleatorio entre -100 y 100
        double pos = Math.random() * 100;
        double neg = Math.random() * -100;
        Random rand =new Random();
        double azar = rand.nextBoolean() ? pos : neg;
        System.out.println(azar);

    }
}
