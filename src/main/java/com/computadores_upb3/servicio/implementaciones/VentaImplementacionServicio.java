package com.computadores_upb3.servicio.implementaciones;

import com.computadores_upb3.modelo.entidades.Venta;
import com.computadores_upb3.modelo.repositorios.VentaRepositorio;
import com.computadores_upb3.servicio.VentaServicio;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VentaImplementacionServicio implements VentaServicio {

    private final VentaRepositorio ventaRepositorio;

    public VentaImplementacionServicio(VentaRepositorio ventaRepositorio) {
        this.ventaRepositorio = ventaRepositorio;
    }

    @Override
    public List<Venta> getTodasVenta(){

        return ventaRepositorio.findAll();
    }

    @Override
    public List<Venta> getTodasVentaManual(){

        return ventaRepositorio.traerTodo();
    }
}
