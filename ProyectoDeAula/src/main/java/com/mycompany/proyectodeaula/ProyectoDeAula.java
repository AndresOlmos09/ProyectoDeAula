/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectodeaula;

import com.mycompany.proyectodeaula.modelo.Consulta;
import com.mycompany.proyectodeaula.modelo.Empleado;
import com.mycompany.proyectodeaula.modelo.Enfermero;
import com.mycompany.proyectodeaula.modelo.Especialidad;
import com.mycompany.proyectodeaula.modelo.HistoriaClinica;
import com.mycompany.proyectodeaula.modelo.Medico;
import com.mycompany.proyectodeaula.modelo.Paciente;
import com.mycompany.proyectodeaula.modelo.Persona;
import com.mycompany.proyectodeaula.modelo.SistemaUrgencias;
import com.mycompany.proyectodeaula.modelo.Triaje;
import com.mycompany.proyectodeaula.utilidades.NivelUrgencia;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author anifl
 */
public class ProyectoDeAula {

    public static void main(String[] args) {
        SistemaUrgencias sistema = new SistemaUrgencias("Hospital");
        
        Especialidad especialidad1 = new Especialidad("Urgencias", "Atención inmediata de casos críticos");
        
        Medico medico = new Medico("1508", 8, 45692520, "Medico General", "Iverson", "Marrugo",
                "1143334470", LocalDate.of(1976, 4, 8));
        
        Enfermero enfermero = new Enfermero(73574192, "Enfermero jefe", "Ivet", "Arnedo",
                "1143334470", LocalDate.of(1978, 10, 18), "Amanecido");
        
        HistoriaClinica historia = new HistoriaClinica(1001, LocalDate.now(), "Asma", "Penicilina",new ArrayList<>());
        
        Paciente paciente = new Paciente(3116258, "O+", "Andres Olmos", historia, "Emily", "Iglesias",
                "1201226337", LocalDate.of(2007, 2, 18));
        
        especialidad1.addMedico(medico);
        medico.setEspecialidad(especialidad1);
        sistema.addEspecialidad(especialidad1);
        sistema.contratarEmpleado(medico);
        sistema.contratarEmpleado(enfermero);
        sistema.registrarPaciente(paciente);
 
        Triaje triaje = new Triaje(1, LocalDate.now(), "Dolor al orinar",
            NivelUrgencia.NARANJA, "120/80", 37.2, 78);
        paciente.getHistoriaClinica().addTriaje(triaje);
        enfermero.getTriajes().add(triaje);
 
        Consulta consulta = new Consulta(1, LocalDate.now(), "", "", "Abierta", paciente);
        medico.getConsultas().add(consulta);

        System.out.println("===== " + sistema.getNombreHospital() + " =====");
 
        System.out.println("\n--- Ficha del paciente  ---");
        System.out.println(paciente.generarFicha());
 
        System.out.println("\n--- Triaje ---");
        System.out.println(triaje);
        System.out.println("¿Es urgente? " + triaje.esUrgente());
        System.out.println("Nivel: " + triaje.getNivelUrgencia().getDescripcion());
 
        System.out.println("\n--- Consulta ---");
        System.out.println("Estado antes: " + consulta.getEstado());

        String resultado = consulta.cerrarConsulta("Nebulización y reposo", "Crisis asmática");
        System.out.println(resultado);
        System.out.println("Estado después: " + consulta.getEstado());
 
        System.out.println("\n--- Personas del hospital ---");
        List<Persona> personas = new ArrayList<>();
        personas.add(paciente);
        personas.add(medico);
        personas.add(enfermero);
        for (Persona p : personas) {
            System.out.println(p.getNombre() + " " + p.getApellido() + " - " + p.calcularEdad() + " años");
        }
 
        System.out.println("\n--- Búsquedas ---");
        Paciente encontrado = sistema.getPacienteByDocumento("1201226337");
        System.out.println("Paciente encontrado: " + encontrado.getNombre());
        Empleado emp = sistema.getEmpleadoById(73574192);
        System.out.println("Empleado encontrado: " + emp.getNombre() + " (" + emp.getCargo() + ")");
        Medico m = especialidad1.getMedicoByNumeroColegiado("1508");
        System.out.println("Médico por colegiado: " + m.getNombre());
    }
}
