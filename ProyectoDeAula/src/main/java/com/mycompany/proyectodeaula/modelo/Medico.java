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
 * @author anifl
 */
public class Medico extends Empleado{
    
    private String numeroColegiado;
    private int experiencia;
    private List<Consulta> consultas;
    private Especialidad especialidad;

    
    //Constructor
    public Medico(String numeroColegiado, int experiencia, int idEmpleado, String cargo, String nombre, String apellido, String id, LocalDate fechanacimiento) {
        super(idEmpleado, cargo, nombre, apellido, id, fechanacimiento);
        this.numeroColegiado = numeroColegiado;
        this.experiencia = experiencia;
        this.consultas = new ArrayList<>();
    }
    
    
    //Getters Y Setters
    
    public Especialidad getEspecialidad() {
    return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
    this.especialidad = especialidad;
    }
    
    public String getNumeroColegiado() {
        return numeroColegiado;
    }

    public void setNumeroColegiado(String numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    @Override
    public int calcularEdad() {
        return super.calcularEdad(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
    
    
}
