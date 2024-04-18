package com.example.Fortnite.repository;

import com.example.Fortnite.classes.Juego;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface JuegoRepository extends CrudRepository<Juego, Long> {

    boolean existsByNombreJuego(String nombreJuego);
}
