package com.computadores_upb3.servicio;

import com.computadores_upb3.modelo.entidades.Venta;

import java.util.List;

public interface VentaServicio {
    List<Venta> getTodasVenta();

    List<Venta> getTodasVentaManual();

}
