/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectodeaula.modelo;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author MI EQUIPO
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String id;
    private LocalDate fechanacimiento;

    public Persona(String nombre, String apellido, String id, LocalDate fechanacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.fechanacimiento = fechanacimiento;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(LocalDate fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

   public int calcularEdad(){
       return java.time.Period.between(fechanacimiento, LocalDate.now()).getYears();
   }
    
    
    
    
    
    
}
