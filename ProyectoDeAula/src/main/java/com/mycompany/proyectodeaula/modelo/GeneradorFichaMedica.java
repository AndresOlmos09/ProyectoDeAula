/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectodeaula.modelo;

/**
 *
 * @author MI EQUIPO
 */
public class GeneradorFichaMedica {

    public GeneradorFichaMedica() {
    }
    
    
    public String generarFicha(Paciente p){
        return "Ficha médica del paciente\n"  
                + "Número de historia clínica: " 
                + p.getNumeroHistoriaClinica() + "\n"
                + "Tipo de sangre: " + p.getTipoSangre() + "\n"
                + "Contacto de emergencia: "
                + p.getContactoEmergencia();
    }
        
}
 
