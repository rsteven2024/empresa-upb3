package com.computadores_upb3.Controlador;

import com.computadores_upb3.modelo.entidades.Cliente;

import com.computadores_upb3.servicio.ClienteServicio;


import org.springframework.web.bind.annotation.*;


import java.time.LocalDate;
import java.util.List;

@RestController
public class ClienteControlador {
    private final ClienteServicio clienteServicio;



    public ClienteControlador(ClienteServicio clienteServicio){
        this.clienteServicio = clienteServicio;
    }

    @GetMapping("/cliente")
    public List<Cliente> getCliente(){
        List<Cliente> clientes = clienteServicio.getTodoCliente();
        return clientes;
    }

    @PostMapping("/actualizatcliente/{id_cliente}/{nombre}/{apellido}/{telefono}/{correo}/{fecha_nacimiento}/{direccion}")
    Integer actualizarCliente(@PathVariable Long id_cliente, @PathVariable String nombre, @PathVariable String apellido, @PathVariable String telefono, @PathVariable String correo, @PathVariable LocalDate fecha_nacimiento, @PathVariable String direccion){
        return clienteServicio.updateCliente(id_cliente,nombre,apellido,telefono,correo,fecha_nacimiento,direccion);
    }

    @PostMapping("/crearcliente")
    public Integer crearCliente(@RequestBody Cliente nuevoCliente) {
        return clienteServicio.insertarCliente(nuevoCliente.getNombre(), nuevoCliente.getApellido(), nuevoCliente.getTelefono(),
                nuevoCliente.getCorreo(), nuevoCliente.getFecha_nacimiento(), nuevoCliente.getDireccion());
    }
}
