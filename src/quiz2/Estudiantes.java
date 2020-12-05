/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

/**
 *
 * @author Kenneth Cedeno
 */
public class Estudiantes {
    String nombre = "nadie";
    int carne = 0;
    String nombrePadre = "nadie";
    String nombreMadre = "nadie";
    
    
    public Estudiantes(int carne, String nombre, String nombrePadre, String nombreMadre) {
        this.nombre = nombre;
        this.carne = carne;
        this.nombrePadre = nombrePadre;
        this.nombreMadre = nombreMadre;
    }

    public void mostrarDatos() {
        System.out.println(nombre + " " + carne);
    }

    //gets y sets

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCarne() {
        return carne;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    public String getNombreMadre() {
        return nombreMadre;
    }

    public void setNombreMadre(String nombreMadre) {
        this.nombreMadre = nombreMadre;
    }
    
}
