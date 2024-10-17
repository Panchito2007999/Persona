/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author paco
 */
public class Estudiante extends Persona{
    
    private int matricula;
    
    public Estudiante(String nombre, String apellidos, int edad, int matricula){
        super(nombre, apellidos,edad);
        this.matricula = matricula;
    }
    
    public int getMatricula(){
        return this.matricula;
    }
    
    public void setMatricula(int mat){
        this.matricula = mat;
    }
}

