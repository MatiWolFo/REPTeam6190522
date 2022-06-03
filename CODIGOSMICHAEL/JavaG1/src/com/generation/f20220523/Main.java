package com.generation.f20220523;

public class Main {
    public static void main(String[] args) {
        //variables Primitivas
        //Se define el tipo de dato cual pertenecera la variable
        //Tipo de dato ----> nombre_de_variable ----> Asignación
        String nombre = "Adam";
        System.out.println(nombre);

        //16bit
        char letraA = 'a';

        //variables numericas

        //32bit
        int numeroInt = 65;
        System.out.println(numeroInt);
        //8bit
        byte numeroByte = 127;
        System.out.println(numeroByte);
        //16bit
        short numeroShort = 258;
        System.out.println(numeroShort);
        //64bit
        long numeroLong = 2355754;
        System.out.println(numeroLong);

        //variables tipo objeto float y double

        //variable booleana (True o False)

        boolean acepta = true;


        String genero = "Masculino";
        if (genero.equals("Masculino")) {
            System.out.println(genero);
        } else
            System.out.println("Femenino");


        String color = "Rubio";

        System.out.println(color);

        boolean comprometido = true;

        System.out.println(comprometido);


        String curso3 = null;     //null
        //comparar un String con null


        //float y double
        float altura = (float) 1.78;
        float peso = 85.5F;

        //ejercicio


        int num1 = 12;
        String num2 = Integer.toString(num1);
        Short.parseShort(num2);
        System.out.println(num2);


        /*Conversion de datos*/
        //automatica
        //byte > short > long > float > double

        int num4 = 18;
        float num4f = num4;
        System.out.println(num4 + " " + num4f);

        //manual
        //double > float > long > int
        Double peso2 = 75.9;
        Float peso2F = Float.valueOf(peso2.toString());


        //sin f la variable es de tipo double primitivo
        float numPrimitivo = 123.4f;
        Float numObjeto = 123.4f;
        System.out.println(numObjeto.getClass());

        //de float a int se pierden los decimales


        if(5 == (3+2)) {

        }

    }
}