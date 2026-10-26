/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectodeaula.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Enfermero extends Empleado{
    
   private String turno;
   private List<Triaje> triajes = new ArrayList<>();
   
    public Enfermero(int idEmpleado, String cargo, String nombre, String apellido, String id, LocalDate fechanacimiento, String turno) {
        super(idEmpleado, cargo, nombre, apellido, id, fechanacimiento);
        this.turno = turno;
        this.triajes = new ArrayList<>();
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public List<Triaje> getTriajes() {
        return triajes;
    }

    public void setTriajes(List<Triaje> triajes) {
        this.triajes = triajes;
    }

    @Override
    public int calcularEdad() {
        return super.calcularEdad(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
   
    
    
   
   
   
}
