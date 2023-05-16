package Entidades;

public class Proveedor {
    private String nombreInstitucion;
    private String ruc;


    @Override
    public String toString() {
        return "Proveedor{" +
                "nombreInstitucion='" + nombreInstitucion + '\'' +
                ", ruc='" + ruc + '\'' +
                '}';
    }

    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
}
