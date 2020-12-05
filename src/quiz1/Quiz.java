package quiz1;
import java.util.Scanner;
/**
 *
 * @author Kenneth Cedeno
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Notas sistema = new Notas();
        Scanner berenjena = new Scanner(System.in);
        int paraQueSeRepita = 0;
        
        while (paraQueSeRepita == 0) {
            

            System.out.println("Ingrese el nombre del alumno: ");
            String nombre = berenjena.next();
            System.out.println("Ingrese el carne: ");
            int deRes = berenjena.nextInt();
            System.out.println("Ingrese el nombre del padre: ");
            String superf = berenjena.next();
            
            Estudiante naiskirobiliat = new Estudiante(deRes, nombre, superf);
            
            System.out.println("Inserte la nota obtenida: ");
            int nota = berenjena.nextInt();
            System.out.println("Inserte el total de puntos: ");
            int totalDePuntos = berenjena.nextInt();
            System.out.println("Inserte puntos obtenidos: ");
            int puntosObtenidos = berenjena.nextInt();
            
            Examenes f = new Examenes(naiskirobiliat,totalDePuntos,puntosObtenidos,nota);
            
            sistema.agregarEx(f);
            
            sistema.mostrarExamen();
        }
    }
    
}
