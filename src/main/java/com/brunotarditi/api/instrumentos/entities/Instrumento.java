package com.brunotarditi.api.instrumentos.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "instrumento")
public class Instrumento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_instrumento")
    private long id;

    @Column(name = "instrumento", length = 120)
    private String instrumento;

    @Column(name = "marca", length = 45)
    private String marca;

    @Column(name = "modelo", length = 45)
    private String modelo;

    @Column(name = "imagen", length = 45)
    private String imagen;

    @Column(name = "precio")
    private double precio;

    @Column(name = "costo_envio", length = 10)
    private String costoEnvio;

    @Column(name = "cantidad_vendida")
    private int cantidadVendida;

    @Column(name = "descripcion", length = 500)
    private String descripcion;
    
}
