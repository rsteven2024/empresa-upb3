package com.computadores_upb3.Controlador;

import com.computadores_upb3.modelo.entidades.Cliente;
import com.computadores_upb3.servicio.ClienteServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteControlador {
    private final ClienteServicio clienteServicio;

    public ClienteControlador(ClienteServicio clienteServicio){
        this.clienteServicio=clienteServicio;
    }
    @GetMapping("/cliente")
    public List<Cliente> getCliente(){
        return clienteServicio.getTodoCliente();
    }
}