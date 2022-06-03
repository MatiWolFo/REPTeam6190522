package com.generation.f20220525;

import com.sun.source.tree.DoWhileLoopTree;

import java.util.Scanner;

public class BucleDoWhile {

    public static void main(String[] args) {

        //Do while
        //A lo menos se ejecutara una vez
        /*Scanner sc = new Scanner(System.in);
        int opcion = 90000;
        do {


            System.out.println("(0) salir \n (1) sumar \n (2) restar \n (3) multiplicar \n (4) dividir");
            opcion = sc.nextInt();//capturando el ingreso por consola


        } while (opcion < 0  || opcion > 4);

        System.out.println("***************");*/

            // DoWhile
            // a lo menos se ejecutara una vez
            int termino = 20;
            do {

                System.out.println("el valor de termino es " + termino);

            } while (termino <= 10);

            System.out.println("***************");

            while (termino <= 10) {
                System.out.println("el valor de termino es " + termino);
                termino++;
            }

        }


        }


