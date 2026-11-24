/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectodeaula.modelo;

import java.time.LocalDate;
import java.time.Period;
    
/**
 *
 * @author MI EQUIPO
 */
public abstract class Persona {
    private String nombre;
    private String apellido;
    private String id;
    private LocalDate fechaNacimiento;

    public Persona() {
    }  
        
    public Persona(String nombre, String apellido, String id, LocalDate fechanacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.fechaNacimiento = fechanacimiento;
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
        return fechaNacimiento;
    }

    public void setFechanacimiento(LocalDate fechanacimiento) {
        this.fechaNacimiento = fechanacimiento;
    }
    
    public void setFechaNacimiento(int anio, int mes, int dia) {
        this.fechaNacimiento = LocalDate.of(anio, mes, dia);
    }
    
   public int calcularEdad() {
       try{
            if(fechaNacimiento == null){
                throw new RuntimeException("La fecha de nacimiento no está definida");
            }
            return Period.between(fechaNacimiento, LocalDate.now()).getYears();
        }catch(Exception e){
            throw new RuntimeException("Error al calcular la edad, ", e);
        }
    }
   
    protected String nombreCompleto() {
        return nombre + " " + apellido;
    }
   
   public abstract String obtenerRol();
   public abstract String mostrarResumen();   
}
