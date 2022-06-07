package com.generation.f20220602;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Listas Usuario, Alumnos y Profesores
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        List<Alumno> listaAlumnos = new ArrayList<Alumno>();
        List<Profesor> listaProfesores = new ArrayList<Profesor>();


        //usuario(padre) y listaUsuarios
        Usuario diana321 = new Usuario();//instancia
        diana321.setNombreUsuario("Diana321");//set
        diana321.setPassword("hola1234");//set
        diana321.setSexo("Femenino");//set
        diana321.setEmail("dianamp@gmail.com");//set
        listaUsuarios.add(diana321);//add a usuario "diana321" a listaUsuarios

        Usuario michael321 = new Usuario();//instancia
        michael321.setNombreUsuario("Michael321");//set
        michael321.setPassword("hola4321");//set
        michael321.setSexo("Masculino");//set
        michael321.setEmail("michaelr@gmail.com");//set
        listaUsuarios.add(michael321);//add a usuario "michael321" a listaUsuarios

        Usuario alondra321 = new Usuario();//instancia
        alondra321.setNombreUsuario("Alondra321");//set
        alondra321.setPassword("hola43215");//set
        alondra321.setSexo("Femenino");//set
        alondra321.setEmail("alondra@gmail.com");//set
        listaUsuarios.add(alondra321);//add a usuario "alondra321" a listaUsuarios

        Usuario matias321 = new Usuario();//instancia
        matias321.setNombreUsuario("Matias321");//set
        matias321.setPassword("hola43216");//set
        matias321.setSexo("Masculino");//set
        matias321.setEmail("matias@gmail.com");//set
        listaUsuarios.add(matias321);//add a usuario "matias321" a listaUsuarios

        Usuario paulino321 = new Usuario();//instancia
        paulino321.setNombreUsuario("Paulino321");//set
        paulino321.setPassword("hola43217");//set
        paulino321.setSexo("Masculino");//set
        paulino321.setEmail("paulino@gmail.com");//set
        listaUsuarios.add(paulino321);//add a usuario "paulino321" a listaUsuarios

        Usuario israel321 = new Usuario();//instancia
        israel321.setNombreUsuario("Israel321");//set
        israel321.setPassword("hola2143");//set
        israel321.setSexo("Masculino");//set
        israel321.setEmail("israelp@gmail.com");//set
        listaUsuarios.add(israel321);//add a usuario "israel321" a listaUsuarios

        Usuario pamela321 = new Usuario();//instancia
        pamela321.setNombreUsuario("Pamela321");//set
        pamela321.setPassword("hola3421");//set
        pamela321.setSexo("Femenino");//set
        pamela321.setEmail("pamelan@gmail.com");//set
        listaUsuarios.add(pamela321);//add a usuario "pamela321" a listaUsuarios

        //alumno(hijo) y listaAlumnos
        Alumno diana = new Alumno();
        diana.setId_alum(1);
        diana.setCurso("G1");
        diana.setNombre("Diana");
        diana.setAsistencia(true);
        diana.setAsignatura("Java");
        diana.setNombreUsuario("Diana321");
        diana.setPassword("hola1234");
        diana.setSexo("Femenino");
        diana.setEmail("dianamp@gmail.com");
        listaAlumnos.add(diana);

        Alumno michael = new Alumno();
        michael.setId_alum(2);
        michael.setCurso("G1");
        michael.setNombre("Michael");
        michael.setAsistencia(true);
        michael.setAsignatura("Java");
        michael.setNombreUsuario("Michael321");
        michael.setPassword("hola4321");
        michael.setSexo("Masculino");
        michael.setEmail("michaelr@gmail.com");
        listaAlumnos.add(michael);

        Alumno alondra = new Alumno();
        alondra.setId_alum(3);
        alondra.setCurso("G1");
        alondra.setNombre("Alondra");
        alondra.setAsistencia(true);
        alondra.setAsignatura("Java");
        alondra.setNombreUsuario("Alondra321");
        alondra.setPassword("hola43215");
        alondra.setSexo("Femenino");
        alondra.setEmail("alondra@gmail.com");
        listaAlumnos.add(alondra);

        Alumno matias = new Alumno();
        matias.setId_alum(4);
        matias.setCurso("G1");
        matias.setNombre("Matias");
        matias.setAsistencia(true);
        matias.setAsignatura("Java");
        matias.setNombreUsuario("Matias321");
        matias.setPassword("hola43216");
        matias.setSexo("Masculino");
        matias.setEmail("matias@gmail.com");
        listaAlumnos.add(matias);

        Alumno paulino = new Alumno();
        paulino.setId_alum(5);
        paulino.setCurso("G1");
        paulino.setNombre("Paulino");
        paulino.setAsistencia(true);
        paulino.setAsignatura("Java");
        paulino.setNombreUsuario("Paulino321");
        paulino.setPassword("hola43217");
        paulino.setSexo("Masculino");
        paulino.setEmail("paulino@gmail.com");
        listaAlumnos.add(paulino);


        //profesor(hijo) y listaProfesores
        Profesor israel = new Profesor();
        israel.setAsignatura("JAVA");
        israel.setNombre("Israel");
        israel.setPrueba("HOLAMUNDO");
        israel.setDireccion("Av. Padre las casas 2309");
        israel.setTelefono("+56936748593");
        israel.setId_escuela("I01");
        israel.setAnioentrada(2022);
        israel.setCurriculum("Al dia");
        israel.setNombreUsuario("Israel321");
        israel.setPassword("hola2143");
        israel.setSexo("Masculino");
        israel.setEmail("israelp@gmail.com");
        listaProfesores.add(israel);

        Profesor pamela = new Profesor();
        pamela.setAsignatura("JAVA");
        pamela.setNombre("Pamela");
        pamela.setPrueba("HOLAMUNDO uwu");
        pamela.setDireccion("Av. americo vespucio 234");
        pamela.setTelefono("+56936748555");
        pamela.setId_escuela("I01");
        pamela.setAnioentrada(2022);
        pamela.setCurriculum("Al dia");
        pamela.setNombreUsuario("Pamela321");
        pamela.setPassword("hola3421");
        pamela.setSexo("Femenino");
        pamela.setEmail("pamelan@gmail.com");
        listaProfesores.add(pamela);

        System.out.println("************************************Generation************************************");

        System.out.println("Lista de usuarios: ");
        for (int i = 0; i < listaUsuarios.size(); i++) {
            System.out.println((i+1+". ")+listaUsuarios.get(i).getNombreUsuario());
            System.out.println(listaUsuarios.get(i).toString());
            System.out.println("");
        }

        System.out.println("**********************************************************************************");

        System.out.println("Lista de estudiantes: ");

        for (int i = 0; i < listaAlumnos.size(); i++) {
            System.out.println((i+1+". ")+listaAlumnos.get(i).getNombreUsuario());
            System.out.println(listaAlumnos.get(i).toString());
            System.out.println("");
        }
        System.out.println("**********************************************************************************");

        System.out.println("Lista de profesores: ");

        for (int i = 0; i < listaProfesores.size(); i++) {
            System.out.println((i+1+". ")+listaProfesores.get(i).getNombreUsuario());
            System.out.println(listaProfesores.get(i).toString());
            System.out.println("");
            ;
        }

        System.out.println("**********************************************************************************");


    }
}
