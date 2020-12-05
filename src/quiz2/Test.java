/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;
import java.util.Scanner;
/**
 *
 * @author Kenneth Cedeno
 */
public class Test {
    public static void main(String[] args) {
        
        Nota sistema = new Nota();
        Scanner berenjena = new Scanner(System.in);
        int paraQueSeRepita = 0;
        
        while (paraQueSeRepita == 0) {
            

            System.out.println("Ingrese el nombre del alumno: ");
            String nombre = berenjena.next();
            System.out.println("Ingrese el carne: ");
            int deRes = berenjena.nextInt();
            System.out.println("Ingrese el nombre del padre: ");
            String superf = berenjena.next();
            System.out.println("Ingrese el nombre de la madre: ");
            String suuperf = berenjena.next();
            
            Estudiantes naiskirobiliat = new Estudiantes(deRes, nombre, superf, suuperf);
            
            System.out.println("Inserte la nota obtenida: ");
            int nota = berenjena.nextInt();
            System.out.println("Inserte el total de puntos: ");
            int totalDePuntos = berenjena.nextInt();
            System.out.println("Inserte puntos obtenidos: ");
            int puntosObtenidos = berenjena.nextInt();
            
            Examen f = new Examen(naiskirobiliat,totalDePuntos,puntosObtenidos,nota);
            
            sistema.agregarEx(f);
            
            sistema.mostrarExamen();
            
        }
    }
}
