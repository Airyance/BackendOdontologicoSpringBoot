/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.airyance.BackendOdontologicoSpringBoot.Modelos;

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
@Table(name="odontologos")
public class OdontologoModelo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (unique = true, nullable = false)
    private int Id;
    
    private String nombre;
    private String consultorio;
    
    
}
