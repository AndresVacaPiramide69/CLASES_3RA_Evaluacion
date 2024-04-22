package com.example.Fortnite.classes;

import jakarta.persistence.*;

import java.util.StringJoiner;

@Entity
@Table(name = "tarjeta_de_credito")
public class TarjetaDeCredito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_de_tarjeta")
    private int numeroTarjeta;

    @Column(name = "mes")
    private int mesTarjeta;

    @Column(name = "year_tarjeta")
    private int yearTarjeta;

    @Column(name = "cvv")
    private int cvvTarjeta;

    @OneToOne(mappedBy = "tarjetaDeCredito")
    private Usuario usuario;

    public TarjetaDeCredito() {}

    public TarjetaDeCredito(int numeroTarjeta, int mesTarjeta, int yearTarjeta, int cvvTarjeta, Usuario usuario) {
        this.numeroTarjeta = numeroTarjeta;
        this.mesTarjeta = mesTarjeta;
        this.yearTarjeta = yearTarjeta;
        this.cvvTarjeta = cvvTarjeta;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public int getMesTarjeta() {
        return mesTarjeta;
    }

    public void setMesTarjeta(int mesTarjeta) {
        this.mesTarjeta = mesTarjeta;
    }

    public int getYearTarjeta() {
        return yearTarjeta;
    }

    public void setYearTarjeta(int yearTarjeta) {
        this.yearTarjeta = yearTarjeta;
    }

    public int getCvvTarjeta() {
        return cvvTarjeta;
    }

    public void setCvvTarjeta(int cvvTarjeta) {
        this.cvvTarjeta = cvvTarjeta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", TarjetaDeCredito.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("numeroTarjeta=" + numeroTarjeta)
                .add("mesTarjeta=" + mesTarjeta)
                .add("yearTarjeta=" + yearTarjeta)
                .add("cvvTarjeta=" + cvvTarjeta)
                .add("usuario=" + usuario)
                .toString();
    }
}
