package ejercicios;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Comuna maipu = new Comuna();
        maipu.setIdComuna(1);
        maipu.setNombre("Maipú");

        Provincia santiago = new Provincia();
        santiago.setIdProvincia(1);
        santiago.setNombre("Santiago");

        Region rm = new Region();
        rm.setIdRegion(1);
        rm.setNombre("RM");

        santiago.setRegion(rm);
        maipu.setProvincia(santiago);


        System.out.println(maipu.getNombre());


    }
}
