package com.generation.f20220601;

import com.generation.f20220601.modelos.Gato;
import com.generation.f20220601.modelos.Mascota;
import com.generation.f20220601.modelos.Mishi;
import com.generation.f20220601.modelos.Perro;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //herencia
        //Algo que se utilizo y que se lo entrega a otro

        Mascota mascota = new Mascota();
        mascota.setColor("Gris");
        mascota.setNombre("Tobias");


        //Asignar atribustos de la clase Mascota con extends

        Perro perro = new Perro();
        perro.setColor("Cafe");
        Gato gato = new Gato();
        gato.setColor("Blanco");
        gato.setGarrasRetractil(true);

        System.out.println(gato.toString());

        Mishi mishi = new Mishi(true);
        mishi.setColor("Amarillo");
        mishi.setNombre("Cuchufli");
        System.out.println(mishi.toString());

        /*Polimorfismo*/
        List<Mascota> listaMascotas = new ArrayList<Mascota>();
        Mascota regalon = new Mascota("Verde","Alien","Sin pelaje","Xanu",2.3f,"Macho");

        listaMascotas.add(regalon);

        Mascota felix = new Gato();
        felix.setNombre("Felix");
        felix.setEspecie("Felyno");
        felix.setPeso(3.2f);
        listaMascotas.add(felix);

        Mascota chocolo = new Perro();

        chocolo.setColor("Negro");
        chocolo.setEspecie("Bulldog");
        chocolo.setPeso(5.5f);
        listaMascotas.add(chocolo);

        regalon.hacerSonido();
        felix.hacerSonido();
        chocolo.hacerSonido();

        System.out.println("******");
        //recorrer el arreglo
        for (Mascota mascota2 : listaMascotas) {
            mascota2.hacerSonido();
        }

        //transformar el objeto

        Perro perroChocolo = (Perro) chocolo;
        perroChocolo.setNumPaseos(2);
    }
}
