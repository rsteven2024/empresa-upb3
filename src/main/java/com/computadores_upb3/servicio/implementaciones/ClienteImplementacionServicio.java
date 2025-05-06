package com.computadores_upb3.servicio.implementaciones;

import com.computadores_upb3.modelo.entidades.Cliente;
import com.computadores_upb3.modelo.repositorios.ClienteRepositorio;
import com.computadores_upb3.servicio.ClienteServicio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteImplementacionServicio implements ClienteServicio {

    private final ClienteRepositorio clienteRepositorio;

    public ClienteImplementacionServicio(ClienteRepositorio clienteRepositorio){
        this.clienteRepositorio=clienteRepositorio;
    }

    @Override
    public List<Cliente> getTodoCliente(){

        return clienteRepositorio.findAll();
    }

}
