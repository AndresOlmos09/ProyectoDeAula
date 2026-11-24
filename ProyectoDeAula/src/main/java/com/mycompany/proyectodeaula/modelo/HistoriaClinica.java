/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectodeaula.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
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
    private List<Consulta> consultas;

    public HistoriaClinica() {
        this.triajes = new ArrayList<>();
        this.consultas = new ArrayList<>();
    }
    
    public HistoriaClinica(int numeroHistoria, LocalDate fechaApertura, String antecedentesMedicos, String alergias) {
        this.numeroHistoria = numeroHistoria;
        this.fechaApertura = fechaApertura;
        this.antecedentesMedicos = antecedentesMedicos;
        this.alergias = alergias;
        this.triajes = new ArrayList<>();
        this.consultas = new ArrayList<>();
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
        return Collections.unmodifiableList(triajes);
    }

    public void addTriaje(Triaje triaje) {
        triajes.add(triaje);
    }
  
    public Triaje addTriaje(int idTriaje, LocalDate fecha, String sintomas, String presion,
                            double temperatura, int frecuencia) {
        Triaje nuevo = new Triaje(idTriaje, fecha, sintomas, presion, temperatura, frecuencia);
        triajes.add(nuevo);
        return nuevo;
    }
    
    public List<Consulta> getConsulta(){
        return Collections.unmodifiableList(consultas);
    }
    
    public void addConsulta(Consulta consulta) {
        if (!consultas.contains(consulta)) {
            consultas.add(consulta);
        }
    }
    
    public Triaje getTriajeById(int id) {
        for (Triaje t : triajes) {
            if (t.getIdTriaje() == id) {
                return t;
            }
        }
        throw new IllegalArgumentException("No existe un triaje con id " + id);
    }

    public Triaje getUltimoTriaje() {
        if (triajes.isEmpty()) {
            throw new IllegalStateException("La historia clínica no tiene triajes");
        }
        return triajes.get(triajes.size() -1);
    }
    
}