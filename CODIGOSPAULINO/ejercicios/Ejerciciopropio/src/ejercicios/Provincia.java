package ejercicios;

import java.util.List;

public class Provincia {
    private Integer IdProvincia;
    private Region Region;
    private String Nombre;
    private List<Comuna> ListaComuna;

    public Provincia(Integer idProvincia, ejercicios.Region region, String nombre, List<Comuna> listaComuna) {
        IdProvincia = idProvincia;
        Region = region;
        Nombre = nombre;
        ListaComuna = listaComuna;
    }

    public Provincia() {
    }

    public Integer getIdProvincia() {
        return IdProvincia;
    }

    public void setIdProvincia(Integer idProvincia) {
        IdProvincia = idProvincia;
    }

    public ejercicios.Region getRegion() {
        return Region;
    }

    public void setRegion(ejercicios.Region region) {
        Region = region;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public List<Comuna> getListaComuna() {
        return ListaComuna;
    }

    public void setListaComuna(List<Comuna> listaComuna) {
        ListaComuna = listaComuna;
    }
}
