package com.computadores_upb3.modelo.repositorios;

import com.computadores_upb3.modelo.entidades.Computador;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface ComputadorRepositorio extends Repository<Computador, Long> {

    List<Computador> findAll();

    @Query(value = "select from * computador",nativeQuery = true)
    List<Computador> traerTodo();

}
