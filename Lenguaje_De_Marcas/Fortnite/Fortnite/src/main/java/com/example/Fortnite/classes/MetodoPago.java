package com.example.Fortnite.classes;

import jakarta.persistence.*;

import java.util.StringJoiner;

@Entity
@Table(name = "metodo_de_pago")
public class MetodoPago {

    @Id
    private Long id;

    @Column(name = "numero_tarjeta")
    private String numeroTarjeta;

    @Column(name = "mes_tarjeta")
    private int mesTarjeta;

    @Column(name = "year_tarjeta")
    private int yearTarjeta;

    @OneToOne
    @JoinColumn(name = "fk_id_usuario", referencedColumnName = "id")
    private Usuario usuario;

    public Long getId() {
        return id;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", MetodoPago.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("numeroTarjeta='" + numeroTarjeta + "'")
                .add("mesTarjeta=" + mesTarjeta)
                .add("yearTarjeta=" + yearTarjeta)
                .add("usuario=" + usuario)
                .toString();
    }
}
