package com.computadores_upb3.controlador;

import com.computadores_upb3.modelo.entidades.Venta;
import com.computadores_upb3.servicio.VentaServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VentaControlador {

    private final VentaServicio ventaServicio;

    public VentaControlador(VentaServicio ventaServicio) {
        this.ventaServicio = ventaServicio;
    }

    @GetMapping("/ventas")
    public List<Venta> getVentas(){
        return ventaServicio.getTodasVenta();
    }

    @GetMapping("/ventasManual")
    public List<Venta> getVentaManual(){
        return ventaServicio.getTodasVentaManual();
    }
}
