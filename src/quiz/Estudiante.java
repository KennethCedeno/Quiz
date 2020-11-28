/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author Kenneth Cedeno
 */
public class Estudiante {

    String nombre = "nadie";
    int carne = 0;
    String nombrePadre = "nadie";
    
    
    
    public Estudiante(int carne, String nombre, String nombrePadre) {
        this.nombre = nombre;
        this.carne = carne;
        this.nombrePadre = nombrePadre;
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
}
