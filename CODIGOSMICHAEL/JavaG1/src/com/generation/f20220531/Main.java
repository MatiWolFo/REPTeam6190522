package com.generation.f20220531;

import com.generation.f20220531.manager.ClienteManager;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        // arreglo de clientes

        List<Cliente> listaClientes = new ArrayList<Cliente>();


        //instancia de cliente
        //Si no se agrega constructor, por default se agrega uno vacio
        /*Cliente cliente = new Cliente();
        cliente.setId(123);
        cliente.setNombre("Pablo");
        cliente.setRut("18703520-1");*/
        do {


            //excepciones
            Cliente clienteDatosDinamicos = new Cliente();
            System.out.println("Ingrese el id del cliente");
            Integer id = sc.nextInt();
            clienteDatosDinamicos.setId(id);
            sc.nextLine();


        /*try {
            Integer id = Integer.parseInt(idString);
            clienteDatosDinamicos.setId(id);
        }catch (Exception e){
            System.out.println("No puede ingresar una letra como identificador");
        }*/
        /*
        System.out.println("Ingrese el nombre del cliente");
        String nombre = sc.nextLine();
        clienteDatosDinamicos.setRut(nombre);

        System.out.println("Ingrese el correo del cliente");
        String correo = sc.nextLine();
        clienteDatosDinamicos.setRut(correo);

        System.out.println("Ingrese el rut del cliente");
        String rut = sc.nextLine();
        clienteDatosDinamicos.setRut(rut);*/

        try {
        /*Integer id = Integer.parseInt(idString);
        clienteDatosDinamicos.setId(id + 1);
        sc.nextLine();*/
                //nombre
                System.out.println("Ingrese el nombre de Cliente");
                String nombre = sc.nextLine();
                clienteDatosDinamicos.setNombre(nombre);

                // rut
                System.out.println("Ingrese el rut de Cliente");
                String rut = sc.nextLine();
                clienteDatosDinamicos.setRut(rut);
                // correo
                System.out.println("Ingrese el correo de Cliente");
                String correo = sc.nextLine();
                clienteDatosDinamicos.setCorreo(correo);



        }catch (ArithmeticException ae) {
                System.out.println("Error al dividir por 0");

            } catch (NullPointerException npe) {
                System.out.println("No se puede realizar la operacion matematica, un dato es nulo");
            } catch (InputMismatchException ime) {
                System.out.println("Error en el ingreso de un dato");
            } catch (NumberFormatException nfe) {
                System.out.println("No puede ingresar un letra como identificador " + nfe);
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error, contecte al administrador " + e);
            }
            System.out.println("Desea ingresar un nuevo cliente? (1)Si (0) No");
            opcion = sc.nextInt();
            sc.nextLine();

             while (opcion > 1 || opcion < 0){

                 System.out.println("Porfavor ingrese un 1 o 0");
                 opcion = sc.nextInt();
                 sc.nextLine();

             }
            listaClientes.add(clienteDatosDinamicos);

        } while (opcion == 1);







        //ACCEDER AL METODO DE OTRA CLASE
        //INSTANCIA DE CLASE

        ClienteManager cm = new ClienteManager();
        cm.recorrerArregloCliente(listaClientes);

    }
}