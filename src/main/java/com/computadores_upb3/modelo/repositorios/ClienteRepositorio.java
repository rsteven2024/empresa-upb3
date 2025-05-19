package com.computadores_upb3.modelo.repositorios;
import com.computadores_upb3.modelo.entidades.Cliente;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface ClienteRepositorio extends Repository<Cliente, Long> {

    List<Cliente> findAll();

    @Query(value = "select from * cliente", nativeQuery = true)
    List<Cliente> traerTodo();


    @Query(value = """
    UPDATE clientes 
    SET nombre = :nombre, 
        apellido = :apellido, 
        telefono = :telefono, 
        correo = :correo, 
        fecha_nacimiento = :fechaNacimiento, 
        direccion = :direccion 
    WHERE id_cliente = :id_cliente
""", nativeQuery = true)
    @Modifying
    @Transactional
    Integer actualizarTodosLosClientes(
            @Param("id_cliente") Long id_cliente,
            @Param("nombre") String nombre,
            @Param("apellido") String apellido,
            @Param("telefono") String telefono,
            @Param("correo") String correo,
            @Param("fechaNacimiento") LocalDate fechaNacimiento,
            @Param("direccion") String direccion);


    @Modifying
    @Transactional
    @Query(value = """
    INSERT INTO clientes (nombre, apellido, telefono, correo, fecha_nacimiento, direccion)
    VALUES (:nombre, :apellido, :telefono, :correo, :fecha_nacimiento, :direccion)
""", nativeQuery = true)
    Integer insertarCliente(
            @Param("nombre") String nombre,
            @Param("apellido") String apellido,
            @Param("telefono") String telefono,
            @Param("correo") String correo,
            @Param("fecha_nacimiento") LocalDate fecha_nacimiento,
            @Param("direccion") String direccion);
}