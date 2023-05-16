package Entidades;

public class Paciente{
    private String nombre;
    private String apellido;
    private String dni;
    private boolean sis;
    private int edad;


    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", sis=" + sis +
                ", edad=" + edad +
                '}';
    }

    // aqui empiezan los g n s
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public boolean isSis() {
        return sis;
    }

    public void setSis(boolean sis) {
        this.sis = sis;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    //aqui acaban los getters n setters :v
}
