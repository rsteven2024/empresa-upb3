package com.computadores_upb3.modelo.entidades;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;


@Entity
@Table(name = "ventas")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_ventas;
    private Long fk_id_empleado;
    private Long fk_id_cliente;
    private Long fk_id_computador;
    private LocalDate fecha_venta;
    private Integer cantidad;
    private Integer total_venta;

}
