package com.generation.f20220526;

import java.util.Arrays;


public class ColeccionArray {

    public static void main(String[] args) {
        //Array
        String[] colores ={"verde", "amarillo", "rojo", "azul"};
        Integer[] numerosPares = {2,3,4,7,9,11,12};
        int [] otrosnumeros= {4,3,6,1,7,9,11};

        //posicion inicial es 0

        System.out.println(colores[0]);
        System.out.println(numerosPares[0]);
        System.out.println(otrosnumeros[0]);

        //Con <array>[index] imprimimos lo que esta en la posicion
        System.out.println(otrosnumeros[3]);

        //Sobreescribiendo
        otrosnumeros[3] = 0;
        System.out.println(otrosnumeros[3]);

        //No se puede agregar otro valor en el array si no existe la posicion
        //otrosnumeros[11] = 23;

        int max = Arrays.stream(otrosnumeros).sum();//Stream igual a array???
        System.out.println(max);

        int cosa = colores.length;
        System.out.println(cosa);

        System.out.println(Arrays.toString(otrosnumeros));


        //recorrer un arreglo

        for (int i = 0; i < otrosnumeros.length; i++) {

            System.out.print("["+otrosnumeros[i]+"]");

        }
        System.out.println("\n");
        for (int i : otrosnumeros){ //no se puede asignar un tipo de variable a otro
                                    // por ejemplo un array de int no puede ser String
            System.out.print("["+i+"]");


        }


    }


}
