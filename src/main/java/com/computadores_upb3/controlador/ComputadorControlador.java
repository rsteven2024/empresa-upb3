package com.computadores_upb3.controlador;

import com.computadores_upb3.modelo.entidades.Computador;
import com.computadores_upb3.servicio.ComputadorServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ComputadorControlador {

    private final ComputadorServicio computadorServicio;

    public ComputadorControlador(ComputadorServicio computadorServicio) {
        this.computadorServicio = computadorServicio;
    }

    @GetMapping("/computador")
    public List<Computador> getComputador(){
        return computadorServicio.getTodasComputador();
    }

    @GetMapping("/computadorManual")
    public List<Computador> getComputadorManual(){
        return computadorServicio.getTodasComputadorManual();
    }

}
