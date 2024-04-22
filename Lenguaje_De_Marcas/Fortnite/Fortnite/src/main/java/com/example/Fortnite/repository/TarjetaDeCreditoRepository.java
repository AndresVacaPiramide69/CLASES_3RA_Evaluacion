package com.example.Fortnite.repository;

import com.example.Fortnite.classes.TarjetaDeCredito;
import com.example.Fortnite.classes.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarjetaDeCreditoRepository extends CrudRepository<TarjetaDeCredito, Long> {
}
