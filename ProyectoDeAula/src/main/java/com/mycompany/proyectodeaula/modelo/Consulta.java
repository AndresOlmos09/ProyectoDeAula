/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectodeaula.modelo;

import java.time.LocalDate;

/**
 *
 * @author MI EQUIPO
 */
public class Consulta {
    private int idConsulta;
    private LocalDate Fecha;
    private String diagnostico;
    private String tratamiento;
    private String estado; 
    private Paciente paciente;

    public Consulta(int idConsulta, LocalDate Fecha, String diagnostico, String tratamiento, String estado, Paciente paciente) {
        this.idConsulta = idConsulta;
        this.Fecha = Fecha;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.estado = estado;
        this.paciente = paciente;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate Fecha) {
        this.Fecha = Fecha;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
     
    public String cerrarConsulta(String tratamiento, String diagnostico){
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.estado = "Cerrada"; 
        
        return "Consulta cerrada. Diagnóstico: " + diagnostico + ". Tratamiento: " + tratamiento;
    }

    @Override
    public String toString() {
        return "Consulta{" + "idConsulta=" + idConsulta + ", Fecha=" + Fecha + ", diagnostico=" + diagnostico + ", tratamiento=" + tratamiento + ", estado=" + estado + ", paciente=" + paciente + '}';
    }
    
    
}
