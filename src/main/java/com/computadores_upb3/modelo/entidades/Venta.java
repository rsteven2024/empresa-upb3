package com.computadores_upb3.modelo.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "ventas")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long fk_id_empleado;
    Long fk_id_clientes;
    Long fk_id_computador;
    Date fecha_venta;
    Integer cantidad;
    Integer total_venta;

}
