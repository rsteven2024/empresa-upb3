package com.computadores_upb3.modelo.repositorios;
import com.computadores_upb3.modelo.entidades.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface ClienteRepositorio extends Repository<Cliente, Long> {

    List<Cliente> findAll();

    @Query(value = "select from * cliente", nativeQuery = true)
    List<Cliente> traerTodo();
}