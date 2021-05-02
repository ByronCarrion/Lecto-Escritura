package edu.lectoescritura.entidades;

public class modulos {

    private int idmodulo;
    private String nombre;
    private String nombrecorto;
    private String Descripcion;
    private int Score;
    private String created_at;
    private String updated_at;

    public modulos(int idmodulo, String nombre, String nombrecorto, String descripcion, int score, String created_at, String updated_at) {
        this.idmodulo = idmodulo;
        this.nombre = nombre;
        this.nombrecorto = nombrecorto;
        Descripcion = descripcion;
        Score = score;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public int getIdmodulo() {
        return idmodulo;
    }

    public void setIdmodulo(int idmodulo) {
        this.idmodulo = idmodulo;
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

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
