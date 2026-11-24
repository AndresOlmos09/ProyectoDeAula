/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectodeaula.modelo;

import com.mycompany.proyectodeaula.utilidades.EstadoConsulta;
import java.time.LocalDate;

/**
 *
 * @author MI EQUIPO
 */
public class Consulta {
    private int idConsulta;
    private LocalDate fecha;
    private String diagnostico;
    private String tratamiento;
    private EstadoConsulta estado; 
    private Paciente paciente;
    private Medico medico;
    private Triaje triaje;
    private HistoriaClinica historiaClinica;
    
    //se inicializa consulta abierta por defecto porque es una nueva consulta
    public Consulta() {
        this.estado = EstadoConsulta.ABIERTA;
    }
    
    public Consulta(int idConsulta, LocalDate fecha, Paciente paciente, Triaje triaje) {
        this.idConsulta = idConsulta;
        this.fecha = fecha;
        this.paciente = paciente;
        this.triaje = triaje;
        this.estado = EstadoConsulta.ABIERTA;
        this.historiaClinica = paciente.getHistoriaClinica();
        this.historiaClinica.addConsulta(this);
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate Fecha) {
        this.fecha = Fecha;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public EstadoConsulta getEstado() {
        return estado;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public Triaje getTriaje() {
        return triaje;
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }
    
    public void asignarMedico(Medico medico) {
        this.medico = medico;
        medico.addConsultas(this);
    } 
    
    public void registrarDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    
    public void registrarDiagnostico(String diagnostico, String tratamiento) {
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
    }
    
    public String cerrarConsulta() {
        if (diagnostico == null || diagnostico.isEmpty()) {
            return "No se puede cerrar la consulta sin diagnóstico";
        }
        this.estado = EstadoConsulta.CERRADA;
        String t;
        if(tratamiento == null || tratamiento.isEmpty()){
            t = "Sin tratamiento";
        }else{
            t = tratamiento;
        } 
        return "Consulta cerrada. Diagnóstico: " + diagnostico + ". Tratamiento: " + t;
    }
    
    public String cerrarConsulta(String diagnostico) {
        registrarDiagnostico(diagnostico);
        return cerrarConsulta();
    }
    
    public String cerrarConsulta(String diagnostico, String tratamiento) {
        registrarDiagnostico(diagnostico, tratamiento);
        return cerrarConsulta();
    }

    @Override
    public String toString() {
        String nombrePaciente;
        if(paciente != null){
           nombrePaciente = paciente.nombreCompleto();
        }else{
            nombrePaciente = "Sin paciente";
        }
        return "Consulta: " + idConsulta + "\nFecha: " + fecha + "\nPaciente: " + nombrePaciente
                + "\nEstado: " + estado.getDescripcion();
    }
}
