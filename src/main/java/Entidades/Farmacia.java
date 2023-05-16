package Entidades;

public class Farmacia {
    private String nombreMedicamento;
    private String tipoMedicamento;
    private String descripcion;

    @Override
    public String toString() {
        return "Farmacia{" +
                "nombreMedicamento='" + nombreMedicamento + '\'' +
                ", tipoMedicamento='" + tipoMedicamento + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public String getTipoMedicamento() {
        return tipoMedicamento;
    }

    public void setTipoMedicamento(String tipoMedicamento) {
        this.tipoMedicamento = tipoMedicamento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
