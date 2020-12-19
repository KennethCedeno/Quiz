/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenFinal;

/**
 *
 * @author Kenneth Cedeno
 */
public class EquipoSonido {
        static boolean parlanteDerecho = true;
        static boolean parlanteIzq = true;
        static boolean parlanteSubWoofer = true;
        static int volParlanteDer = 0;
        static int volParlanteIzq = 0;
        static int volParlanteSubWoofer = 0;
        
        
    public static boolean isParlanteDerecho() {
        return parlanteDerecho;
    }

    public static void setParlanteDerecho(boolean parlanteDerecho) {
        EquipoSonido.parlanteDerecho = parlanteDerecho;
    }

    public static boolean isParlanteIzq() {
        return parlanteIzq;
    }

    public static void setParlanteIzq(boolean parlanteIzq) {
        EquipoSonido.parlanteIzq = parlanteIzq;
    }

    public static boolean isParlanteSubWoofer() {
        return parlanteSubWoofer;
    }

    public static void setParlanteSubWoofer(boolean parlanteSubWoofer) {
        EquipoSonido.parlanteSubWoofer = parlanteSubWoofer;
    }

    public static int getVolParlanteDer() {
        return volParlanteDer;
    }

    public static void setVolParlanteDer(int volParlanteDer) {
        EquipoSonido.volParlanteDer = volParlanteDer;
    }

    public static int getVolParlanteIzq() {
        return volParlanteIzq;
    }

    public static void setVolParlanteIzq(int volParlanteIzq) {
        EquipoSonido.volParlanteIzq = volParlanteIzq;
    }

    public static int getVolParlanteSubWoofer() {
        return volParlanteSubWoofer;
    }

    public static void setVolParlanteSubWoofer(int volParlanteSubWoofer) {
        EquipoSonido.volParlanteSubWoofer = volParlanteSubWoofer;
    }


        
    
    
}
