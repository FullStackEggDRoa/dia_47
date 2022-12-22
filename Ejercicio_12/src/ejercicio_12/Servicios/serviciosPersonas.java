/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_12.Servicios;

import ejercicio_12.Entidades.Persona;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class serviciosPersonas {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int anio=0;
    int mes=0;
    int dia=0;
    
    public Persona crearPersona(){
        System.out.print("Ingrese el Nombre de la Persona: ");
        String nombre=leer.next();
        System.out.print("Ingrese la fecha de Nacimiento (DD/MM/AAAA): ");
        String fecha=leer.next();
        
      
        do{
            
            anio=Integer.parseInt(fecha.substring(6, 10))-1900;
            mes=Integer.parseInt(fecha.substring(3, 5))-1;
            dia=Integer.parseInt(fecha.substring(0, 2));
            
        }while(fecha.length()!=10); 
        
        Date fechanacimiento = new Date (anio,mes,dia);
        
        return new Persona (nombre,fechanacimiento);
    }
    
    public boolean menorQue(Persona persona,int edad){
        boolean resultado=false;
        if(persona.calcularEdad()<edad){
            resultado=true;
        }else{
            resultado=false;
        }
        return resultado;
    }
}
