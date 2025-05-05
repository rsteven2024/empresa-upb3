package com.computadores_upb3.servicio;

import com.computadores_upb3.modelo.entidades.Computador;

import java.util.List;

public interface ComputadorServicio {
    List<Computador> getTodasComputador();

    List<Computador> getTodasComputadorManual();

}
