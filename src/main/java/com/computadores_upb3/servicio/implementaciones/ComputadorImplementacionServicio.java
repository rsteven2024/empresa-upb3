package com.computadores_upb3.servicio.implementaciones;

import com.computadores_upb3.modelo.entidades.Computador;
import com.computadores_upb3.modelo.repositorios.ComputadorRepositorio;
import com.computadores_upb3.servicio.ComputadorServicio;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ComputadorImplementacionServicio implements ComputadorServicio {

    private final ComputadorRepositorio computadorRepositorio;

    public ComputadorImplementacionServicio(ComputadorRepositorio computadorRepositorio) {
        this.computadorRepositorio = computadorRepositorio;
    }

    @Override
    public List<Computador> getTodasComputador(){

        return computadorRepositorio.findAll();
    }

    @Override
    public List<Computador> getTodasComputadorManual(){

        return computadorRepositorio.traerTodo();
    }
}
