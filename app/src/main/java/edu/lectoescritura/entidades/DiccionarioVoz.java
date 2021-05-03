package edu.lectoescritura.entidades;

public class DiccionarioVoz {

    private int id;
    private int idusuario;
    private String frase;

    public DiccionarioVoz(int id, int idusuario, String frase) {
        this.id = id;
        this.idusuario = idusuario;
        this.frase = frase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
}
