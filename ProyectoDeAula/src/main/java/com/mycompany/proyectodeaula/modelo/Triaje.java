/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectodeaula.modelo;

import com.mycompany.proyectodeaula.utilidades.NivelUrgencia;
import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class Triaje {
    private int idTriaje;
    private LocalDate fechaHora;
    private String sintomasReportados;
    private NivelUrgencia nivelUrgencia;
    private String presionArterial;
    private double temperatura;
    private int frecuenciaCardiaca;

    public Triaje() {
    }

    public Triaje(int idTriaje, LocalDate fechaHora, String sintomasReportados, NivelUrgencia nivelUrgencia, String presionArterial, double temperatura, int frecuenciaCardiaca) {
        this.idTriaje = idTriaje;
        this.fechaHora = fechaHora;
        this.sintomasReportados = sintomasReportados;
        this.nivelUrgencia = nivelUrgencia;
        this.presionArterial = presionArterial;
        this.temperatura = temperatura;
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    public int getIdTriaje() {
        return idTriaje;
    }

    public void setIdTriaje(int idTriaje) {
        this.idTriaje = idTriaje;
    }

    public LocalDate getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDate fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getSintomasReportados() {
        return sintomasReportados;
    }

    public void setSintomasReportados(String sintomasReportados) {
        this.sintomasReportados = sintomasReportados;
    }

    public NivelUrgencia getNivelUrgencia() {
        return nivelUrgencia;
    }

    public void setNivelUrgencia(NivelUrgencia nivelUrgencia) {
        this.nivelUrgencia = nivelUrgencia;
    }

    public String getPresionArterial() {
        return presionArterial;
    }

    public void setPresionArterial(String presionArterial) {
        this.presionArterial = presionArterial;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public int getFrecuenciaCardiaca() {
        return frecuenciaCardiaca;
    }

    public void setFrecuenciaCardiaca(int frecuenciaCardiaca) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    @Override
    public String toString() {
        return "Triaje #" + idTriaje + "\n" 
                + "Nivel de Urgencia: " + nivelUrgencia + "\n" 
                + "Síntomas: " + sintomasReportados + "\n" 
                + "Presion Arterial: " + presionArterial + "\n" 
                + "Temperatura: " + temperatura + " °C" + "\n" 
                + "Frecuencia Cardíaca: " + frecuenciaCardiaca + " lpm";
    }
    
    public boolean esUrgente() {
        return nivelUrgencia == NivelUrgencia.ROJO || nivelUrgencia == NivelUrgencia.NARANJA;
    }
    
    
}
