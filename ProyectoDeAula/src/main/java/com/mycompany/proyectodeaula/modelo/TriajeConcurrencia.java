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
public class TriajeConcurrencia implements Runnable{
    
    private Enfermero enfermero;
    private Paciente paciente;
    private int idTriaje;
    private String sintomas;
    private String presion;
    private double temperatura;
    private int frecuencia;

    public TriajeConcurrencia(Enfermero enfermero, Paciente paciente, int idTriaje, String sintomas, String presion, double temperatura, int frecuencia) {
        this.enfermero = enfermero;
        this.paciente = paciente;
        this.idTriaje = idTriaje;
        this.sintomas = sintomas;
        this.presion = presion;
        this.temperatura = temperatura;
        this.frecuencia = frecuencia;
    }

    @Override
    public void run() {
        try{
            System.out.println(enfermero.getNombre() + "inició el triaje de " + paciente.getNombre());
            
            Thread.sleep(3000);
            
            Triaje t=paciente.getHistoriaClinica().addTriaje(idTriaje, LocalDate.now(),sintomas, presion, temperatura, frecuencia );
            
            enfermero.addTriaje(t);
            
             System.out.println(enfermero.getNombre() + "finalizo el triaje de " + paciente.getNombre());
            
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
            System.out.println("Triaje Interrumpido");
                    
        }
    }
   
    
    
}
