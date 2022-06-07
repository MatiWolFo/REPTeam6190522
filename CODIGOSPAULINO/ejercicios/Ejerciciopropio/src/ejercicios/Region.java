package ejercicios;

import java.util.List;

public class Region {
    private Integer IdRegion;
    private String Nombre;
    private List<Provincia> ListaProvincia;

    public Region() {
    }

    public Region(Integer idRegion, String nombre, List<Provincia> listaProvincia) {
        IdRegion = idRegion;
        Nombre = nombre;
        ListaProvincia = listaProvincia;
    }

    public Integer getIdRegion() {
        return IdRegion;
    }

    public void setIdRegion(Integer idRegion) {
        IdRegion = idRegion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public List<Provincia> getListaProvincia() {
        return ListaProvincia;
    }

    public void setListaProvincia(List<Provincia> listaProvincia) {
        ListaProvincia = listaProvincia;
    }
}
