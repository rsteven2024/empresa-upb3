package com.computadores_upb3.servicio;

import com.computadores_upb3.modelo.entidades.Cliente;


import java.time.LocalDate;
import java.util.List;

public interface ClienteServicio {

    List<Cliente> getTodoCliente();

    Integer updateCliente(Long id_cliente, String nombre, String apellido, String telefono, String correo, LocalDate fecha_nacimiento, String direccion);

    Integer insertarCliente(String nombre, String apellido, String telefono, String correo, LocalDate fecha_nacimiento, String direccion);
}
