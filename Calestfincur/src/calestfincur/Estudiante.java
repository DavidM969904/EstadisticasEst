/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calestfincur;

/**
 *
 * @author labctr
 */
public class Estudiante {
    private double not;
    private int sem;
    
    public Estudiante(double not, int sem)
    {
        this.not = not;
        this.sem = sem;
    }
    
    public double getNot()
    {
        return not;
    }
    
    public void setNot(Double nota)
    {
        this.not = nota;
    }
    
    public int getSem()
    {
        return sem;
    }
    
    public void setSem(int se)
    {
        this.sem = se;
    }
    
    
}
