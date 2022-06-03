package com.generation.f20220602;


import com.generation.f20220602.modelos.Alumno;
import com.generation.f20220602.modelos.Asistencia;
import com.generation.f20220602.modelos.Profesor;
import com.generation.f20220602.modelos.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;



        //Lista

        List<Usuario> listaUsu = new ArrayList<Usuario>();
        List<Alumno> listaAlumno = new ArrayList<Alumno>();
        List<Profesor> listaPro = new ArrayList<Profesor>();

        //Instancias

        Usuario user = new Usuario();
        Profesor profe = new Profesor();


        //Agregando alumno


        do {
            Alumno alum = new Alumno();
            int opcion2 = 0;

            System.out.println("Ingrese el nombre del alumno");
            String nombre = sc.nextLine();
            alum.setNombre(nombre);


            System.out.println("Ingrese el sexo del alumno");
            String sexo = sc.nextLine();
            alum.setSexo(sexo);

            System.out.println("Ingrese email");
            String email = sc.nextLine();
            alum.setEmail(email);

            System.out.println("Ingrese el nombre del curso");
            String curso = sc.nextLine();
            alum.setCurso(curso);

            System.out.println("Esta ausente el alumno? (1)Si (0)No");
            opcion2 = sc.nextInt();
            if (opcion2 == 0) {
                alum.setAsistencia(true);
            } else {
                alum.setAsistencia(false);
            }
            while (opcion2 > 1 || opcion2 < 0) {

                System.out.println("Porfavor ingrese un 1 o 0");
                opcion2 = sc.nextInt();
                sc.nextLine();

            }

            //NUMEROS IDS NO SON AL AZAR PERO AL MOMENTO NO RECONOSCO MANERA DE HACER AUTOMATICAMENTE EN ORDEN
            int numeroazar =  rand.nextInt(100);
            alum.setId_alum(numeroazar);

            System.out.println("Desea ingresar un nuevo alumno? (1)Si (0) No");
            opcion = sc.nextInt();
            sc.nextLine();

            while (opcion > 1 || opcion < 0){

                System.out.println("Porfavor ingrese un 1 o 0");
                opcion = sc.nextInt();
                sc.nextLine();

            }
            listaAlumno.add(alum);



        }while(opcion == 1);


        Asistencia asi = new Asistencia();
        asi.asistenciaAlumno(listaAlumno);



    }


}
