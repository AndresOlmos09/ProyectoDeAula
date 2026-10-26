/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectodeaula.modelo;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class HistoriaClinica {
    
    private int numeroHistoria;
    private LocalDate fechaApertura;
    private String antecedentesMedicos;
    private String alergias;
    private List<Triaje> triajes;

    public HistoriaClinica(int numeroHistoria, LocalDate fechaApertura, String antecedentesMedicos, String alergias, List<Triaje> triaje) {
        this.numeroHistoria = numeroHistoria;
        this.fechaApertura = fechaApertura;
        this.antecedentesMedicos = antecedentesMedicos;
        this.alergias = alergias;
        this.triajes = triaje;
    }

    public int getNumeroHistoria() {
        return numeroHistoria;
    }

    public void setNumeroHistoria(int numeroHistoria) {
        this.numeroHistoria = numeroHistoria;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getAntecedentesMedicos() {
        return antecedentesMedicos;
    }

    public void setAntecedentesMedicos(String antecedentesMedicos) {
        this.antecedentesMedicos = antecedentesMedicos;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public List<Triaje> getTriaje() {
        return triajes;
    }

    public void setTriaje(List<Triaje> triaje) {
        this.triajes = triaje;
    }
  
    public void addTriaje(Triaje triaje){
        triajes.add(triaje);
    }
    
  }
    

