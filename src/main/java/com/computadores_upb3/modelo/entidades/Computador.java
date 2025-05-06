package com.computadores_upb3.modelo.entidades;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "computador")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Computador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String marca;
    String procesador;
    String ram_gb;
    String almacenamiento_gb;
    Integer precio;
    Long fk_id_proveedores;

}
