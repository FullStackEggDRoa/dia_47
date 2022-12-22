/* Ejercicio 12:
   Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
   (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
   métodos:
    Agregar un método de creación del objeto que respete la siguiente firma:
   crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
   usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
   fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
    Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
   en cuenta que para conocer la edad de la persona también se debe conocer la fecha
   actual.
    Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
   edad y retorna true en caso de que el receptor tenga menor edad que la persona que
   se recibe como parámetro, o false en caso contrario.
    Metodo mostrarPersona(): este método muestra la persona creada en el método
   anterior.
 */
package ejercicio_12;

import ejercicio_12.Entidades.Persona;
import ejercicio_12.Servicios.serviciosPersonas;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        serviciosPersonas sP = new serviciosPersonas();
        Persona p1 = new Persona();
        p1=sP.crearPersona(); // Daniel
        System.out.println(p1.getNombre()+" tiene "+p1.calcularEdad()+" Años.");
        
        System.out.print("Ingrese la edad de otra Persona: ");
        int edadOtraPersona = leer.nextInt();
        System.out.print(p1.getNombre()+" tiene menor edad que la edad Ingresada?: ");
        if(sP.menorQue(p1, edadOtraPersona)){
            System.out.println("Si");
        }else{
            System.out.println("No");
        }
        if(p1.menorQue(35)){
        
        }
        p1.mostrarPersona();
        ///Test
        
        //System.out.println("Nombre: "+p1.getNombre());
        //System.out.println("Fecha: "+p1.getFechaNacimiento());
    }
    
}
