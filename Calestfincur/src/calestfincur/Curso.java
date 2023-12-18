/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calestfincur;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author labctr
 */
public class Curso {
    private String nombre;
    private int nest;
    private double notaprom;
    private int ganadores;
    private int perdedores;
    private double semestreprom;
    private List<Estudiante> estudiantes;
    
    Curso(String nombre, int nest)
    {
        this.nombre = nombre;
        this.nest = nest;
        this.estudiantes = new ArrayList<>();
    }
     
    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    
    public double getNotaprom() {
    return notaprom;
}

public int getGanadores() {
    return ganadores;
}

public int getPerdedores() {
    return perdedores;
}

public double getSemestreprom() {
    return semestreprom;
}

    public void calcularEstadisticas() {
        if (estudiantes.size() == 0) {
            System.out.println("No hay estudiantes para calcular estadísticas.");
            return;
        }

        double sumaNotas = 0.0;
        double sumaSemestres = 0.0;
        int ganadores = 0;
        int perdedores = 0;

        // Iterar sobre la lista de estudiantes
        for (Estudiante estudiante : estudiantes) {
            sumaNotas += estudiante.getNot();
            sumaSemestres += estudiante.getSem();

            // Contar ganadores y perdedores
            if (estudiante.getNot() >= 14.0) {
                ganadores++;
            } else {
                perdedores++;
            }
        }

        // Calcular estadísticas finales
        notaprom = sumaNotas / estudiantes.size();
        semestreprom = sumaSemestres / estudiantes.size();
        this.ganadores = ganadores;
        this.perdedores = perdedores;
    }
    
    public void mostrarDatos() {
    System.out.println("Estadísticas del curso:");
    System.out.println("Nota promedio: " + notaprom);
    System.out.println("Semestre promedio: " + (int) semestreprom);
    System.out.println("Estudiantes ganadores: " + ganadores);
    System.out.println("Estudiantes perdedores: " + perdedores);
        }
}


