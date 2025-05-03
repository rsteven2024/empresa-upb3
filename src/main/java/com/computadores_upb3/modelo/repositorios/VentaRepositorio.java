package com.computadores_upb3.modelo.repositorios;

import com.computadores_upb3.modelo.entidades.Venta;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface VentaRepositorio extends Repository<Venta, Long> {

    List<Venta> findAll();

    @Query(value = "select * from ventas",nativeQuery = true)
    List<Venta> traerTodo();

}
