package com.apuntes.apuntes.Classes;

import java.util.StringJoiner;

public class Mascota {
    private int edad;
    private String nombre;

    public Mascota() {
    }

    public Mascota(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Mascota.class.getSimpleName() + "[", "]")
                .add("edad=" + edad)
                .add("nombre='" + nombre + "'")
                .toString();
    }
}
