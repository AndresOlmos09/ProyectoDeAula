/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectodeaula;

import com.mycompany.proyectodeaula.modelo.Consulta;
import com.mycompany.proyectodeaula.modelo.Empleado;
import com.mycompany.proyectodeaula.modelo.Enfermero;
import com.mycompany.proyectodeaula.modelo.Especialidad;
import com.mycompany.proyectodeaula.modelo.Medico;
import com.mycompany.proyectodeaula.modelo.Paciente;
import com.mycompany.proyectodeaula.modelo.Persona;
import com.mycompany.proyectodeaula.modelo.SistemaUrgencias;
import com.mycompany.proyectodeaula.modelo.Triaje;
import com.mycompany.proyectodeaula.modelo.TriajeConcurrencia;
import com.mycompany.proyectodeaula.utilidades.TurnoEnfermero;
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

        Especialidad urologia = new Especialidad("Urología",
                "Diagnóstico y tratamiento de enfermedades del sistema urinario");

        Medico medico = new Medico("1508", 8, 1357911, "Medico Especialista", "Iverson", "Marrugo",
                "73574192", LocalDate.of(1976, 4, 8));
        Enfermero enfermera = new Enfermero(246810, "Enfermero jefe", "Ivet", "Arnedo",
                "45692520", LocalDate.of(1978, 10, 18), TurnoEnfermero.NOCHE);
        
        Enfermero enfermera1=new Enfermero(1029, "Enfermero jefe", "Ety", "Contreras","45556758", LocalDate.of(1981,8,26),TurnoEnfermero.MAÑANA);
        
        Enfermero enfermera2=new Enfermero(1010, "Enfermero jefe", "Carolina", "Herrera","1029500384", LocalDate.of(2000,1,10),TurnoEnfermero.MAÑANA);

        Paciente emily = new Paciente(311, "O+", "Carlos Jaramillo", "Emily", "Iglesias",
                "1201226337", LocalDate.of(2007, 2, 18));
        Paciente nicoll = new Paciente(312, "A+", "Andres Olmos", "Nicoll", "Machado",
                "1050111222", LocalDate.of(2007, 7, 7));
        Paciente fernando = new Paciente(313, "O-", "Lilia Marrugo", "Fernando", "Marrugo",
                "1050333444", LocalDate.of(2007, 8, 15));

        emily.getHistoriaClinica().setAntecedentesMedicos("Infecciones urinarias previas");
        emily.getHistoriaClinica().setAlergias("Penicilina");

        urologia.addMedico(medico);
        sistema.addEspecialidad(urologia);
        sistema.contratarEmpleado(medico);
        sistema.contratarEmpleado(enfermera);
        sistema.contratarEmpleado(enfermera1);
        sistema.contratarEmpleado(enfermera2);
        sistema.registrarPaciente(emily);
        sistema.registrarPaciente(nicoll);
        sistema.registrarPaciente(fernando);

        /*Enfermero repetido = new Enfermero(99, "Auxiliar", "Felipe", "Andrade",
                "1143334470", LocalDate.of(1976, 7, 1), TurnoEnfermero.TARDE);
        if (!sistema.contratarEmpleado(repetido)) {
            System.out.println("No se pudo contratar a Felipe Andrade: documento o id ya registrado");
        }*/

        String[] sintomas = {"Dolor al orinar", "Dolor al orinar, fiebre alta y mareo", "Molestia leve al orinar"};
        String[] presiones = {"120/80", "85/50", "118/76"};
        double[] temperaturas = {38.2, 39.8, 36.8};
        int[] frecuencias = {83, 125, 76};

        List<Paciente> pacientes = new ArrayList<>(sistema.getPacientes());
        List<Triaje> triajes = new ArrayList<>();

        Thread hilo1=new Thread(new TriajeConcurrencia(enfermera, emily, 1, sintomas[0], presiones[0], temperaturas[0], frecuencias[0]));
        Thread hilo2=new Thread(new TriajeConcurrencia(enfermera1, nicoll, 2, sintomas[1], presiones[1], temperaturas[1], frecuencias[1]));
        Thread hilo3=new Thread(new TriajeConcurrencia(enfermera2, fernando, 3, sintomas[2], presiones[2], temperaturas[2], frecuencias[2]));

        System.out.println("===== " + sistema.getNombreHospital() + " =====");

        System.out.println("\n=== Fichas y triajes ===");
        for (Paciente p : pacientes) {
            System.out.println(p.generarFicha());
            Triaje t = p.getHistoriaClinica().getUltimoTriaje();
            System.out.println(t);
            System.out.println("Nivel de urgencia: " + t.getNivelUrgencia().getDescripcion() + "\n");
        }

        System.out.println("=== Pacientes por prioridad ===");
        for (Paciente p : sistema.priorizarPacientes()) {
            Triaje t = p.getHistoriaClinica().getUltimoTriaje();
            System.out.println(t.getNivelUrgencia() + " - " + p.getNombre() + " " + p.getApellido());
        }

            String[] diagnosticos = {"Cistitis aguda", "Pielonefritis aguda", "Irritación urinaria leve"};
        String[] tratamientos = {"Antibioticos recetados", "Antibiotico por vena y observación", ""};

        System.out.println("\n=== Consultas ===");
        for (int i = 0; i < pacientes.size(); i++) {
            Consulta c = new Consulta(i + 1, LocalDate.now(), pacientes.get(i), triajes.get(i));
            c.asignarMedico(medico);
            if (tratamientos[i].isEmpty()) {
                System.out.println(c.cerrarConsulta(diagnosticos[i])); 
            } else {
                System.out.println(c.cerrarConsulta(diagnosticos[i], tratamientos[i]));
            }
        }

        System.out.println("\n=== Personas del hospital  ===");
        List<Persona> personas = new ArrayList<>();
        personas.add(emily);
        personas.add(medico);
        personas.add(enfermera);
        for (Persona p : personas) {
            System.out.println(p.obtenerRol() + "\n" + p.mostrarResumen());
            System.out.println("\n");
        }
        
        /*
        System.out.println("\n=== Búsquedas ===");
        try{
            Paciente encontrado = sistema.getPacienteByDocumento("1201226337");
            System.out.println("Paciente encontrado: " + encontrado.getNombre());
            Empleado emp = sistema.getEmpleadoById(246810);
            System.out.println("Empleado encontrado: " + emp.getNombre() + " (" + emp.getCargo() + ")");
            Medico m = urologia.getMedicoByNumeroColegiado("1508");
            System.out.println("Médico por colegiado: " + m.getNombre());
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        */
    }
        
}
