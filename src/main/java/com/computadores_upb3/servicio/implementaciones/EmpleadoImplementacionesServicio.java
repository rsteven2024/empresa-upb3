package com.computadores_upb3.servicio.implementaciones;

import com.computadores_upb3.modelo.entidades.Empleado;
import com.computadores_upb3.modelo.repositorios.EmpleadoRepositorio;
import com.computadores_upb3.servicio.EmpleadoServicio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoImplementacionesServicio implements EmpleadoServicio {

    private final EmpleadoRepositorio empleadoRepositorio;

    public EmpleadoImplementacionesServicio(EmpleadoRepositorio empleadoRepositorio){
        this.empleadoRepositorio=empleadoRepositorio;
    }

    @Override
    public List<Empleado> getTodoEmpleado(){

        return empleadoRepositorio.findAll();
    }
}
