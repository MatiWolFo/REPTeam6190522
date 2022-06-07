package ejercicios;

public class Comuna {
    private Integer IdComuna;
    private Provincia Provincia;
    private String Nombre;

    public Comuna() {
    }

    public Comuna(Integer idComuna, ejercicios.Provincia provincia, String nombre) {
        IdComuna = idComuna;
        Provincia = provincia;
        Nombre = nombre;
    }

    public Integer getIdComuna() {
        return IdComuna;
    }

    public void setIdComuna(Integer idComuna) {
        IdComuna = idComuna;
    }

    public ejercicios.Provincia getProvincia() {
        return Provincia;
    }

    public void setProvincia(ejercicios.Provincia provincia) {
        Provincia = provincia;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
