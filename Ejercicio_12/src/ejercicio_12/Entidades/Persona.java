/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_12.Entidades;

import java.util.Date;

/**
 *
 * @author droa
 */
public class Persona {
    // Atributos
    private String Nombre;
    private Date fechaNacimiento;
    
    // Constructores

    public Persona() {
    }

    public Persona(String Nombre, Date fechaNacimiento) {
        this.Nombre = Nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    // Métodos

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public int calcularEdad(){
        Date fechaActual = new Date();
        //System.out.println(Nombre+" tiene "+(fechaActual.getYear()-this.fechaNacimiento.getYear())+" Años.");
       return (fechaActual.getYear()-this.fechaNacimiento.getYear()); 
    }
    
    public boolean menorQue(int edad){
        return true;
    }
    
    public void mostrarPersona(){
        System.out.println("Nombre: "+Nombre);
        System.out.println("Fecha de Nacimiento: "+fechaNacimiento);
    }

   
    
    
}
