package com.example.Fortnite.classes;

import java.util.StringJoiner;
public class Noticia {
    private String titulo;
    private String descripcionNoticia;
    private String urlImagen;

    public Noticia(String titulo, String descripcionNoticia, String urlImagen) {
        this.titulo = titulo;
        this.descripcionNoticia = descripcionNoticia;
        this.urlImagen = urlImagen;
    }
    public Noticia(String titulo, String descripcionNoticia){
        this.titulo = titulo;
        this.descripcionNoticia = descripcionNoticia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcionNoticia() {
        return descripcionNoticia;
    }

    public void setDescripcionNoticia(String descripcionNoticia) {
        this.descripcionNoticia = descripcionNoticia;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    @Override
    public String toString() {
        String salida = "Titulo: " + this.titulo;
        salida += "Descripcion Noticia: " + this.descripcionNoticia;
        salida += "UrlImagen: " + this.descripcionNoticia;
        return salida;
    }
}
