package com.computadores_upb3.modelo.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name="empleados")
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_empleado;
    String nombres;
    String apellidos;
    String correo;
    String telefono;
    String cargo;
    Date fecha_contratacion;
}
