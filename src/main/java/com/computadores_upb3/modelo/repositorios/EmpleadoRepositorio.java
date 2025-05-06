package com.computadores_upb3.modelo.repositorios;

import com.computadores_upb3.modelo.entidades.Empleado;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface EmpleadoRepositorio extends Repository<Empleado, Long> {

    List<Empleado> findAll();

    @Query(value = "select * from empleados",nativeQuery = true)
    List<Empleado> traerTodo();
}
