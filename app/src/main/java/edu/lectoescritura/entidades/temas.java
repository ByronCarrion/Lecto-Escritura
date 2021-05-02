package edu.lectoescritura.entidades;

public class temas {

    private int id;
    private String  nombre;
    private String nombrecorto;
    private String Descripcion;
    private boolean esvisible;
    private String imagen;


    public temas(int id, String nombre, String nombrecorto, String descripcion, boolean esvisible, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.nombrecorto = nombrecorto;
        Descripcion = descripcion;
        this.esvisible = esvisible;
        this.imagen = imagen;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombrecorto() {
        return nombrecorto;
    }

    public void setNombrecorto(String nombrecorto) {
        this.nombrecorto = nombrecorto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public boolean isEsvisible() {
        return esvisible;
    }

    public void setEsvisible(boolean esvisible) {
        this.esvisible = esvisible;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
