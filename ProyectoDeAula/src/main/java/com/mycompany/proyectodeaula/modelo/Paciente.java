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
public class Paciente extends Persona{
     private int numeroHistoriaClinica;
     private String tipoSangre;
     private String contactoEmergencia;
     private HistoriaClinica historiaClinica;

    public Paciente() {
        this.historiaClinica = new HistoriaClinica();
    }
    
    public Paciente(int numeroHistoriaClinica, String tipoSangre, String contactoEmergencia, String nombre, String apellido, String id, LocalDate fechanacimiento) {
        super(nombre, apellido, id, fechanacimiento);
        this.numeroHistoriaClinica = numeroHistoriaClinica;
        this.tipoSangre = tipoSangre;
        this.contactoEmergencia = contactoEmergencia;
        this.historiaClinica =  new HistoriaClinica(numeroHistoriaClinica, LocalDate.now(), "", "");
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getContactoEmergencia() {
        return contactoEmergencia;
    }

    public void setContactoEmergencia(String contactoEmergencia) {
        this.contactoEmergencia = contactoEmergencia;
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public int getNumeroHistoriaClinica() {
        return numeroHistoriaClinica;
    }

    public void setNumeroHistoriaClinica(int numeroHistoriaClinica) {
        this.numeroHistoriaClinica = numeroHistoriaClinica;
    }
       
    public String generarFicha(){
        GeneradorFichaMedica generador = new GeneradorFichaMedica();
        return generador.generarFicha(this);
       }

    @Override
    public String obtenerRol() {
        return "Paciente";
    }

    @Override
    public String mostrarResumen() {
        return "Paciente " + nombreCompleto() + "\nHistoria N° " + numeroHistoriaClinica + "\nSangre: " + tipoSangre
            + "\nTriajes: " + historiaClinica.getTriaje().size();
    }
    
       
     
}