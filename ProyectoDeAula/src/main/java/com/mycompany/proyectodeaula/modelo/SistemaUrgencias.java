/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectodeaula.modelo;

import java.util.ArrayList;
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

    //Constructores
    public SistemaUrgencias(){
        this.pacientes = new ArrayList<>();
        this.empleados = new ArrayList<>();
        this.especialidades = new ArrayList<>();
    }
    
    public SistemaUrgencias(String nombreHospital){
        this.nombreHospital = nombreHospital;
        this.pacientes = new ArrayList<>();
        this.empleados = new ArrayList<>();
        this.especialidades = new ArrayList<>();
    }

    public String getNombreHospital() {
        return nombreHospital;
    }

    public void setNombreHospital(String nombreHospital) {
        this.nombreHospital = nombreHospital;
    }
    
    //funcion para agregar los pacientes a la lista de pacientes
    public void registrarPaciente(Paciente p1) {
        pacientes.add(p1);
    }
    
    public Paciente getPacienteByDocumento(String doc1) {
        for (Paciente p : pacientes) {
            if (p.getId()!= null && p.getId().equals(doc1)) {
                return p;
            }
        }
        return null;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }
    
    public void contratarEmpleado(Empleado e1){
        empleados.add(e1);
    }
    
    public Empleado getEmpleadoById(int doc2){
        for(Empleado e: empleados){
            if(e.getIdEmpleado() == doc2){
                return e;
            }
        }
        return null;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }
    
    public void addEspecialidad(Especialidad esp1) {
        especialidades.add(esp1);
    }

    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }
    
    
}
