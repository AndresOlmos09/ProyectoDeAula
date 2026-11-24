/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectodeaula.modelo;

import com.mycompany.proyectodeaula.utilidades.NivelUrgencia;
import java.util.ArrayList;
import java.util.Collections;

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
    public boolean registrarPaciente(Paciente p1) {
        if (getPacienteByDocumento(p1.getId()) != null) {
            return false;
        }
        pacientes.add(p1);
        return true;
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
        return Collections.unmodifiableList(pacientes);
    }
    
    public boolean contratarEmpleado(Empleado empleadoNuevo){
        for (Empleado e : empleados) {
            if (e.getIdEmpleado() == empleadoNuevo.getIdEmpleado()
                    || (e.getId() != null && e.getId().equals(empleadoNuevo.getId()))) {
                return false;
            }
        }
        empleados.add(empleadoNuevo);
        return true;
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
        return Collections.unmodifiableList(empleados);
    }
    
    public void addEspecialidad(Especialidad esp1) {
        especialidades.add(esp1);
    }

    public List<Especialidad> getEspecialidades() {
        return Collections.unmodifiableList(especialidades);
    }
    
    private int prioridad(Paciente p) {
        Triaje t = p.getHistoriaClinica().getUltimoTriaje();
        if (t == null || t.getNivelUrgencia() == null) {
            return NivelUrgencia.values().length;
        }
        return t.getNivelUrgencia().ordinal();
    }
    
    public List<Paciente> priorizarPacientes() {
        List<Paciente> lista = new ArrayList<>(pacientes);
        lista.sort((a, b) -> Integer.compare(prioridad(a), prioridad(b)));
        return lista;
    }
}