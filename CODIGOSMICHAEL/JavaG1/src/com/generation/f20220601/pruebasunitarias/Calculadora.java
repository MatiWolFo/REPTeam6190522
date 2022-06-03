package com.generation.f20220601.pruebasunitarias;

public class Calculadora {

    //Creando metodos basicos de aritmetica

    public int suma(int num1, int num2) {
        return num1 + num2;

    }

    public int resta(int num1, int num2) {
        return num1 - num2;

    }

    public int multiplicacion(int num1, int num2) {
        return num1 * num2;

    }

    public String division(int num1, int num2) {
        if (num2 != 0) {
            String resultado = Integer.toString(num1 / num2);
            return resultado;

        }
        return "No se puede dividir por 0";
    }

    public String Pares(int num1) {

        int resultado = (num1 % 2);

        if (resultado == 0) {

            String resultado1 = "Par";
            return resultado1;
        }else{
            String resultado2 = "Impar";
            return resultado2;
        }

    }
}