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
public class Examen {
    Estudiantes pepe;
    int nota;
    int totalDePuntos;
    int puntosObtenidos;

    public void Examen() {
    }

    public Examen(Estudiantes pepe, int totalDePuntos, int puntosObtenidos, int nota) {
        this.pepe = pepe;
        this.totalDePuntos = totalDePuntos;
        this.puntosObtenidos = puntosObtenidos;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Examenes{" + "pepe=" + pepe + ", nota=" + nota + ", totalDePuntos=" + totalDePuntos + ", puntosObtenidos=" + puntosObtenidos + '}';
    }

    public Estudiantes getPepe() {
        return pepe;
    }

    public void setPepe(Estudiantes pepe) {
        this.pepe = pepe;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getTotalDePuntos() {
        return totalDePuntos;
    }

    public void setTotalDePuntos(int totalDePuntos) {
        this.totalDePuntos = totalDePuntos;
    }

    public int getPuntosObtenidos() {
        return puntosObtenidos;
    }

    public void setPuntosObtenidos(int puntosObtenidos) {
        this.puntosObtenidos = puntosObtenidos;
    }

}
