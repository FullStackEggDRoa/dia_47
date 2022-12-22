/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_13.Servicios;

import ejercicio_13.Entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class serviciosCurso {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public String[] cargarAlumnos(){
        String[] alumnosAux = new String[5];
        for(int i=0;i<5;i++){
            System.out.println("Ingrese el Nombre del Estudiante No."+(i+1)+": ");
            alumnosAux[i]=leer.next();
            
        }
        return alumnosAux;
    }
    
    public Curso crearCurso(){
        System.out.print("Ingrese el Nombre del Curso: ");
        boolean turnoAux=false;
        
        String nombreCurso=leer.next();
        System.out.print("Ingrese la Cantidad de Horas/Día: ");
        int cantidadHorasPorDia=leer.nextInt();
        System.out.print("Ingrese la Cantidad de Días/Semana: ");
        int cantidadDiasPorSemana=leer.nextInt();
        System.out.print("Especifique el Turno (M-Mañana | T-Tarde): ");
        char turno=leer.next().charAt(0);
        
        do {            
            if(turno=='M'){
                turnoAux=true;
            }else{
                turnoAux=false;
            }
        } while (turno != 'M' && turno !='T');
        System.out.print("Ingrese el Precio/Hora: ");
        float precioPorHora=leer.nextFloat();
        return new Curso(nombreCurso,cantidadHorasPorDia,cantidadDiasPorSemana,turnoAux,precioPorHora,cargarAlumnos());
    }
    public void calcularGanciaSemana(Curso curso){
        float ganaciaPorSemana=curso.getCantidadHOrasPorDia()*curso.getPrecioPorHora()*5f*curso.getCantidadDiasPorSemana();
        System.out.println("Ganancia en una Semana del Curso: "+String.format("%.6g", ganaciaPorSemana)+" USD.");
    }
    
}
