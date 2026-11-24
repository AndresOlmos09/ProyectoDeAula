/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectodeaula.utilidades;

/**
 *
 * @author Usuario
 */
public enum EstadoConsulta {
    ABIERTA("Abierta"),
    CERRADA("Cerrada");
    
    private final String descripcion;

    EstadoConsulta(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
}
