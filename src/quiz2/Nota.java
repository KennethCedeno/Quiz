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
public class Nota {
     int registros = 50;

    Examen[] miau = new Examen[registros];
    int cont = 0;

    public Nota() {
    }

    public void mostrarExamen() {
        for (int i = 0; i < cont; i++) {
            if (miau[i] != null) {
                System.out.println(miau[i].toString());
            }
        }
    }

    public boolean agregarEx(Examen ex) {
        boolean resultado = false;
        if (cont < registros) {
            miau[cont] = ex;
            cont++;
            resultado = true;
        }
        return resultado;
    }

    //calcular promedio
    public float promedioNotas() {
        float retorno = 0f;

        return retorno;
    }
}
