package com.example.Fortnite.classes;

public class Idioma {

    private int id;
    private String codigo;
    private String nombre;

    protected Idioma(){}

    public Idioma(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){

        String salida = "ID: " + this.id;
        salida += "Codigo Idioma: " + this.codigo;
        salida += "Nombre: " + this.nombre;

        return salida;
    }
}
