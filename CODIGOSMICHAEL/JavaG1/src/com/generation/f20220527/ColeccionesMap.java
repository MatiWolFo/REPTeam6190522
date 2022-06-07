package com.generation.f20220527;

import java.util.HashMap;

public class ColeccionesMap {
    public static void main(String[] args) {
        //colecciones Map
        //Pares clave <-> valor
        //HashMap< K, V>
        //Key--->Clave ; V----> Valor
        //Hashmap mapa = new Hashmap();

        HashMap<String, String> objHashMap = new HashMap();

        objHashMap.put("Nombre","Michael");
        objHashMap.put("ApellidoP","Roldan");
        objHashMap.put("ApellidoM","Gonzalez");
        objHashMap.put("numFav","7");

        System.out.println("Elemento del mapa");
        System.out.println(objHashMap);

        System.out.println(objHashMap.get("numFav"));
        System.out.println(objHashMap.remove("Nombre"));
        System.out.println(objHashMap);

        //.keyset muestra las llaves del mapa

        System.out.println(objHashMap.keySet());

        //.put agrega elementos

        System.out.println(objHashMap.put("vocales", "a, e, i, o, u"));
        System.out.println(objHashMap.keySet());


        //Crear menu de comida
        //solicitar al usuario que elija el plato
        //luego imprime el plato


        /*objHashMap.put("MenuComida", "Pizza");
        objHashMap.put("MenuComida", "Completo");
        objHashMap.put("MenuComida", "Chorillana");
        objHashMap.put("MenuComida", "Churrasco");
        objHashMap.put("MenuComida", "Bebida");


        System.out.println("MenuComida");//BUSCAR COMO HACER MENU CON HASHMAP*/


        //Como recorrer un HashMap
        //Para recorrer el hashmap se tiene que declarar el tipo de dato son las claves y valores
        for (String clave: objHashMap.keySet() ) {
            System.out.println("Clave: "+clave + "---->" +objHashMap.get(clave));
            
        }


    }
}
