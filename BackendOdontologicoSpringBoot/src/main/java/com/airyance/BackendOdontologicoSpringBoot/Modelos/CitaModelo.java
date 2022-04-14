/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.airyance.BackendOdontologicoSpringBoot.Modelos;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author amazo_000
 */

@Entity
@Table(name="citas")
public class CitaModelo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private long id;
    
    private int id_paciente;
    private int id_odontologo;
    private LocalDate fechaCita;
    private int estado;
    private float total;
    private String observaciones;
    
}
