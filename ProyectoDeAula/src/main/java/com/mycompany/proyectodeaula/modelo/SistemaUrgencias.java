/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectodeaula.modelo;

import java.util.List;

/**
 *
 * @author ASUS
 */
public class SistemaUrgencias {
    
    private String nombreHospital;
    private List<Paciente> pacientes;
    private List<Empleado> empleados;
    private List<Especialidad> especialidades;
    

    public SistemaUrgencias(String nombreHospital, List<Paciente> pacientes, List<Empleado> empleados, List<Especialidad> especialidades) {
        this.nombreHospital = nombreHospital;
        this.pacientes = pacientes;
        this.empleados = empleados;
        this.especialidades = especialidades;
    }

     public void registrarPaciente(Paciente paciente){
         pacientes.add(paciente);
    }
    
    public void contratarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }
    
    public void addEspecialidades(Especialidad especialidad){
        especialidades.add(especialidad);
    }
    
    public String getNombreHospital() {
        return nombreHospital;
    }

    public void setNombreHospital(String nombreHospital) {
        this.nombreHospital = nombreHospital;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }
    
  }
    
    
    

