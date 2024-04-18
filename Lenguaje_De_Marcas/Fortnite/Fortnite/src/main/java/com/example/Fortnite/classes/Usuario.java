package com.example.Fortnite.classes;

import jakarta.persistence.*;

import java.util.StringJoiner;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    private Long id;

    @Column(name = "nombre_usuario")
    private String nombreUsuario;

    @Column(name = "email_usuario")
    private String emailUsuario;

    @Column(name = "password_usuario")
    private String passwordUsuario;

    public Long getId() {
        return id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Usuario.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("nombreUsuario='" + nombreUsuario + "'")
                .add("emailUsuario='" + emailUsuario + "'")
                .add("passwordUsuario='" + passwordUsuario + "'")
                .toString();
    }
}