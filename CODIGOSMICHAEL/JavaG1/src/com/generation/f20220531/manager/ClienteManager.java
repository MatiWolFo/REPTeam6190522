package com.generation.f20220531.manager;

import com.generation.f20220531.Cliente;

import java.util.ArrayList;

import java.util.List;

public class ClienteManager {

    //LOGICA DEL NEGOCIO O VALIDACIONES
    //recorrer el arreglo e imprimir
    public void recorrerArregloCliente(List<Cliente> listaCliente) {

        for (Cliente cliente: listaCliente) {
            System.out.println(cliente.toString());
        }

        }
    }



