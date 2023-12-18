/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calestfincur;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author labctr
 */
public class Calestfincur {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// TODO code application logic here
    Scanner pm = new Scanner(System.in);
    System.out.println("Ingrese los datos:");
    System.out.println("Ingrese el nombre del curso");
    String nc = pm.nextLine();
    System.out.println("Ingrese el numero de estudiantes");
    int n = pm.nextInt();
    
    Curso curso = new Curso(nc,n);

    for(int i = 0; i < n; i++)
    {
    System.out.println("Ingrese los datos para el estudiante " + (i + 1));

            System.out.print("Nota del estudiante: ");
            double notaEstudiante = pm.nextDouble();

            System.out.print("Semestre del estudiante: ");
            int semestreEstudiante = pm.nextInt();

            // Consumir la nueva línea después del entero
            pm.nextLine();

            // Crear un estudiante y agregarlo al curso
            Estudiante estudiante = new Estudiante(notaEstudiante, semestreEstudiante);
            curso.getEstudiantes().add(estudiante);
        }

        // Calcular estadísticas y mostrar datos
        curso.calcularEstadisticas();
        curso.mostrarDatos();


        pm.close();
    
    }
    
    
    
    
}
    

