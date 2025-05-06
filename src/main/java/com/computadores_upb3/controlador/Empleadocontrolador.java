package com.computadores_upb3.Controlador;

import com.computadores_upb3.modelo.entidades.Empleado;
import com.computadores_upb3.servicio.EmpleadoServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Empleadocontrolador {
    private final EmpleadoServicio empleadoServicio;

    public Empleadocontrolador(EmpleadoServicio empleadoServicio){
        this.empleadoServicio=empleadoServicio;
    }

    @GetMapping("/empleado")
    public List<Empleado> getEmpleado(){
        return empleadoServicio.getTodoEmpleado();
    }
}
