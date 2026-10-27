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
        return  "Número de historia clínica: " 
                + p.getNumeroHistoriaClinica() + "\n"
                + "Nombre: " +p.getNombre()+" " +p.getApellido()+ "\n"
                + "Id: " +p.getId()+ "\n"
                + "Edad: " + p.calcularEdad()+ " años\n"
                + "Tipo de sangre: " + p.getTipoSangre() + "\n"
                + "Contacto de emergencia: "+ p.getContactoEmergencia();
    }
        
}
 
