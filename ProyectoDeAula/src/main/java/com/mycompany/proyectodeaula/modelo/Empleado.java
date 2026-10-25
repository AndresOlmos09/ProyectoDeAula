/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectodeaula.modelo;

import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class Empleado extends Persona{
    
    private int idEmpleado;
    private String cargo;

    public Empleado(int idEmpleado, String cargo, String nombre, String apellido, String id, LocalDate fechanacimiento) {
        super(nombre, apellido, id, fechanacimiento);
        this.idEmpleado = idEmpleado;
        this.cargo = cargo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}
