package com.example.Fortnite.classes;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.StringJoiner;

@Entity
@Table(name = "juego")
public class Juego {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_juego")
    private String nombreJuego;

    @Column(name = "juego_activado")
    private boolean juegoActivado;

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @Column(name = "email_creador")
    private String emailCreador;

    @Column(name = "comentario_inicial")
    private String comentarioInicial;

    @Column(name = "visualizar_paises")
    private boolean visualizarPaises;

    public Juego(){
        this.visualizarPaises = true;
    }

    public Juego(String nombreJuego, boolean juegoActivado, Date fechaCreacion, String emailCreador, String comentarioInicial, boolean visualizarPaises) {
        this.nombreJuego = nombreJuego;
        this.juegoActivado = juegoActivado;
        this.fechaCreacion = fechaCreacion;
        this.emailCreador = emailCreador;
        this.comentarioInicial = comentarioInicial;
        this.visualizarPaises = visualizarPaises;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public boolean isJuegoActivado() {
        return juegoActivado;
    }

    public void setJuegoActivado(boolean activado) {
        this.juegoActivado = activado;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getEmailCreador() {
        return emailCreador;
    }

    public void setEmailCreador(String email) {
        this.emailCreador = email;
    }

    public String getComentarioInicial() {
        return comentarioInicial;
    }

    public void setComentarioInicial(String comentarioInicial) {
        this.comentarioInicial = comentarioInicial;
    }

    public boolean isVisualizarPaises() {
        return visualizarPaises;
    }


    public void setVisualizarPaises(boolean visualizarPaises) {
        this.visualizarPaises = visualizarPaises;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Juego.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("nombreJuego='" + nombreJuego + "'")
                .add("activado=" + juegoActivado)
                .add("fechaCreacion=" + fechaCreacion)
                .add("email='" + emailCreador + "'")
                .add("comentarioInicial='" + comentarioInicial + "'")
                .add("visualizarPaises=" + visualizarPaises)
                .toString();
    }
}
