/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectodeaula.modelo;

import java.time.LocalDate;

/**
 *
 * @author ASUS
 */
public class Enfermero extends Empleado {
    
    public Enfermero(int idEmpleado, String cargo, String nombre, String apellido, String id, LocalDate fechanacimiento) {
        super(idEmpleado, cargo, nombre, apellido, id, fechanacimiento);
    }
    
}
