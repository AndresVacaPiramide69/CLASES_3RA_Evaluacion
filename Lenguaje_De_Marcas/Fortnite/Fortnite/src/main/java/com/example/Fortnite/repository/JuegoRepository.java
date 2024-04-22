package com.example.Fortnite.repository;

import com.example.Fortnite.classes.Juego;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JuegoRepository extends CrudRepository<Juego, Long> {

    boolean existsByNombreJuego(String nombreJuego);
}
