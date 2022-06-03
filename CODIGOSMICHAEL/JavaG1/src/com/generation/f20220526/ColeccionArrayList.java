package com.generation.f20220526;

import java.util.ArrayList;
import java.util.Collections;

public class ColeccionArrayList {

    public static void main(String[] args) {
        //ArrayList  //Manera de escribir ArrayList<nombre>--->Nombre de variable
        //Instancia de clase
        //Son dinamicos
        ArrayList<String> colores = new ArrayList<String>();
        ArrayList<Integer> numerosPares = new ArrayList<Integer>();


        colores.add(0, "Azul");
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Amarillo");
        colores.add(2,"Verde");
        System.out.println(colores);
        //Acceder a un elemento
        System.out.println(colores.get(3));
        System.out.println(colores.size());

        //Para ingresar un elemento en un indice que ya esta usado se usa .set
        colores.set(1, "Negro");
        System.out.println(colores);

        //.remove saca elementos y los mueve a la izquierda //.remove saca el primer elemento si se busca por valor
        colores.remove(0);
        System.out.println(colores);

        //Recorriendo arreglo
        //Con <Nombre>.get() puedo sacar el valor que esta en el indice
        for (int i = 0; i < colores.size(); i++) {

            System.out.println(colores.get(i));

        }

        //Ordenar de forma ascendente
        Collections.sort(colores);
        System.out.println(colores);

        numerosPares.add(12);
        numerosPares.add(10);
        numerosPares.add(3);
        numerosPares.add(52);
        numerosPares.add(14);

        System.out.print(numerosPares+ " ");
        System.out.println();
        Collections.sort(numerosPares);
        System.out.println(numerosPares+ " ");


        //.reverse NO ordena descendentemente sino reversa el ultimo order
        Collections.reverse(numerosPares);
        System.out.println(numerosPares+ " ");

        colores.clear();
        System.out.println(colores);

    }
}
