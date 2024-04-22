package com.example.Fortnite.repository;

import com.example.Fortnite.classes.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IdiomaRepository extends CrudRepository <Idioma, Long>{
     List<Idioma> findAll();

     boolean existsByCodigo(String codigo);

     boolean existsByNombre(String codigo);
}
