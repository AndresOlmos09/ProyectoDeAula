/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectodeaula.modelo;


import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author anifl
 */
public class Especialidad {
    private String nombreEspecialidad;
    private String descripcion;
    private List<Medico> medicos;
    
    public Especialidad(){
        this.medicos = new ArrayList<>();
    }
    
    public Especialidad(String nombreEspecialidad, String descripcion) {
        this.nombreEspecialidad = nombreEspecialidad;
        this.descripcion = descripcion;
        this.medicos = new ArrayList<>();
    }

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    }
    
    public void addMedico(Medico m) {
        medicos.add(m);
    }

    public Medico getMedicoByNumeroColegiado(String nc) {
        for (Medico m : medicos) {
            if (m.getNumeroColegiado().equals(nc)) {
                return m;
            }
        }
        return null;
    }

    public List<Medico> getMedicosList() {
        return medicos;
    }
    
    
}
