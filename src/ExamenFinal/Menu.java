/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenFinal;
import java.util.Scanner;
/**
 *
 * @author Kenneth Cedeno
 */
public class Menu {
    public void iniciar() {
        int repetir = 0;
        Scanner u = new Scanner(System.in);
        int opcion;
        int opcion2;
        
        while(repetir==0){
            System.out.println("Inserte el numero que corresponde a lo que desea hacer: ");
            System.out.println("1- Opciones de parlantes");
            System.out.println("2- Opciones de reproduccion");
            System.out.println("3- Salir");
            opcion = u.nextInt();
            
            if(opcion==1){
                System.out.println("Inserte el numero que corresponde a lo que desea hacer: ");
                System.out.println("1- Aumentar/Disminuir el volumen del parlante derecho");
                System.out.println("2- Aumentar/Disminuir el volumen del parlante izquierdo");
                System.out.println("3- Aumentar/Disminuir el volumen del parlante subwoofer");
                System.out.println("4- Apagar/Encender el parlante derecho");
                System.out.println("5- Apagar/Encender el parlante izquierdo");
                System.out.println("6- Apagar/Encender el parlante subwoofer");
                System.out.println("7- Verificar el volumen del parlante derecho");
                System.out.println("8- Verificar el volumen del parlante izquierdo");
                System.out.println("9- Verificar el volumen del parlante subwoofer");
                System.out.println("10- Salir");
                opcion2 = u.nextInt();
                if(opcion2==1){
                    System.out.println("Inserte el volumen al que desea el parlante derecho: (min 1 max 10)");
                    EquipoSonido.setVolParlanteDer(u.nextInt());
                } else if (opcion2==2){
                    System.out.println("Inserte el volumen al que desea el parlante izquierdo: (min 1 max 10)");
                    EquipoSonido.setVolParlanteIzq(u.nextInt());
                } else if (opcion2==3){
                    System.out.println("Inserte el volumen al que desea el parlante subwoofer: (min 1 max 10)");
                    EquipoSonido.setVolParlanteSubWoofer(u.nextInt());
                } else if (opcion2==4){
                    if(EquipoSonido.isParlanteDerecho()==true){
                        EquipoSonido.setParlanteDerecho(false);
                        System.out.println("El parlante se ha apagado.");
                    } else {
                        EquipoSonido.setParlanteDerecho(true);
                        System.out.println("El parlante se ha encendido.");
                    }
                    
                } else if (opcion2==5){
                    if(EquipoSonido.isParlanteIzq()==true){
                        EquipoSonido.setParlanteIzq(false);
                        System.out.println("El parlante se ha apagado.");
                    } else {
                        EquipoSonido.setParlanteIzq(true);
                        System.out.println("El parlante se ha encendido.");
                    }
                } else if (opcion2==6){
                    if(EquipoSonido.isParlanteSubWoofer()==true){
                        EquipoSonido.setParlanteSubWoofer(false);
                        System.out.println("El parlante se ha apagado.");
                    } else {
                        EquipoSonido.setParlanteSubWoofer(true);
                        System.out.println("El parlante se ha encendido.");
                    }
                } else if (opcion2==7){
                    System.out.println("El volumen del parlante derecho es: " + EquipoSonido.getVolParlanteDer());
                } else if (opcion2==8){
                    System.out.println("El volumen del parlante izquierdo es: " + EquipoSonido.getVolParlanteIzq());
                } else if (opcion2==9){
                    System.out.println("El volumen del parlante subwoofer es: " + EquipoSonido.getVolParlanteSubWoofer());
                } 
                //fin de opciones de parlantes
                //inicio de opciones de reproduccion
            } else if (opcion == 2){
                
            }
        }
    }
}
