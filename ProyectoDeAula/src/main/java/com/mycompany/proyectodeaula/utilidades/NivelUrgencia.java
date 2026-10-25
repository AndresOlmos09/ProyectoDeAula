/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectodeaula.utilidades;

/**
 *
 * @author Usuario
 */
public enum NivelUrgencia {
    ROJO("Atención inmediata"),
    NARANJA("Muy urgente"),
    AMARILLO("Urgente"),
    VERDE("No urgente");
    
    private final String descripcion;

    NivelUrgencia(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
