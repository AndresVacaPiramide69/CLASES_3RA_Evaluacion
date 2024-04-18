package com.example.Fortnite.repository;

import com.example.Fortnite.classes.*;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IdiomaRepository extends CrudRepository <Idioma, Long>{
     List<Idioma> findAll();

     boolean existsByCodigo(String codigo);

     boolean existsByNombre(String codigo);
}
