package edu.lectoescritura.entidades;

public class teoria {

    private int id;
    private String titulo;
    private String imagen;
    private String introduccion;
    private String pregunta;
    private String respuestapregunta;
    private String ejemplos;
    private String imgejemplo;
    private String urlvideo;

    public teoria(int id, String titulo, String imagen, String introduccion, String pregunta, String respuestapregunta, String ejemplos, String imgejemplo, String urlvideo) {
        this.id = id;
        this.titulo = titulo;
        this.imagen = imagen;
        this.introduccion = introduccion;
        this.pregunta = pregunta;
        this.respuestapregunta = respuestapregunta;
        this.ejemplos = ejemplos;
        this.imgejemplo = imgejemplo;
        this.urlvideo = urlvideo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getIntroduccion() {
        return introduccion;
    }

    public void setIntroduccion(String introduccion) {
        this.introduccion = introduccion;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuestapregunta() {
        return respuestapregunta;
    }

    public void setRespuestapregunta(String respuestapregunta) {
        this.respuestapregunta = respuestapregunta;
    }

    public String getEjemplos() {
        return ejemplos;
    }

    public void setEjemplos(String ejemplos) {
        this.ejemplos = ejemplos;
    }

    public String getImgejemplo() {
        return imgejemplo;
    }

    public void setImgejemplo(String imgejemplo) {
        this.imgejemplo = imgejemplo;
    }

    public String getUrlvideo() {
        return urlvideo;
    }

    public void setUrlvideo(String urlvideo) {
        this.urlvideo = urlvideo;
    }
}



