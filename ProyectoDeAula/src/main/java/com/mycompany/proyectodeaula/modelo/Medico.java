/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectodeaula.modelo;

import java.time.LocalDate;

/**
 *
 * @author anifl
 */
public class Medico extends Empleado{
    
    private String numeroColegiado;
    private int experiencia;
    private List<Consulta> consultas;

    
    //Constructor
    public Medico(String numeroColegiado, int experiencia, List consultas, int idEmpleado, String cargo, String nombre, String apellido, String id, LocalDate fechanacimiento) {
        super(idEmpleado, cargo, nombre, apellido, id, fechanacimiento);
        this.numeroColegiado = numeroColegiado;
        this.experiencia = experiencia;
        this.consultas = new ArrayList<>();
    }
    
    
    //Getters Y Setters
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

    public List getConsultas() {
        return consultas;
    }

    public void setConsultas(List consultas) {
        this.consultas = consultas;
    }
    
    
    
    
    
    
}
