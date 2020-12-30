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
public class EquipoSonidoControladora {
    
    
    
    public void iniciar() {
        Parlantes nuevo = new Parlantes();
        int n = 0;
        int repetir = 0;
        Scanner u = new Scanner(System.in);
        int opcion;
        int opcion2;
        int hora;
        int minuto;
        String[] listaAudios = new String[1000]; 
            for(int i=0;i<1000;i++){ 
            listaAudios[i] = ""; 
            }
        
        while(repetir == 0){
            System.out.println("Inserte el numero que corresponde a lo que desea hacer: ");
            System.out.println("1- Opciones de parlantes");
            System.out.println("2- Opciones de reproduccion");
            System.out.println("3- Configurar alarma");
            System.out.println("4- Salir");
            opcion = u.nextInt();
            
            //inicio de opciones de parlantes   
            if(opcion == 1){
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
                if(opcion2 == 1){
                    System.out.println("Inserte el volumen al que desea el parlante derecho: (min 1 max 10)");
                    nuevo.setVolParlanteDer(u.nextInt());
                } else if (opcion2==2){
                    System.out.println("Inserte el volumen al que desea el parlante izquierdo: (min 1 max 10)");
                    nuevo.setVolParlanteIzq(u.nextInt());
                } else if (opcion2==3){
                    System.out.println("Inserte el volumen al que desea el parlante subwoofer: (min 1 max 10)");
                    nuevo.setVolParlanteSubWoofer(u.nextInt());
                } else if (opcion2==4){
                    if(nuevo.isParlanteDerecho()==true){
                        nuevo.setParlanteDerecho(false);
                        System.out.println("El parlante se ha apagado.");
                    } else {
                        nuevo.setParlanteDerecho(true);
                        System.out.println("El parlante se ha encendido.");
                    }
                    
                } else if (opcion2==5){
                    if(nuevo.isParlanteIzq()==true){
                        nuevo.setParlanteIzq(false);
                        System.out.println("El parlante se ha apagado.");
                    } else {
                        nuevo.setParlanteIzq(true);
                        System.out.println("El parlante se ha encendido.");
                    }
                } else if (opcion2==6){
                    if(nuevo.isParlanteSubWoofer()==true){
                        nuevo.setParlanteSubWoofer(false);
                        System.out.println("El parlante se ha apagado.");
                    } else {
                        nuevo.setParlanteSubWoofer(true);
                        System.out.println("El parlante se ha encendido.");
                    }
                } else if (opcion2==7){
                    System.out.println("El volumen del parlante derecho es: " + nuevo.getVolParlanteDer());
                } else if (opcion2==8){
                    System.out.println("El volumen del parlante izquierdo es: " + nuevo.getVolParlanteIzq());
                } else if (opcion2==9){
                    System.out.println("El volumen del parlante subwoofer es: " + nuevo.getVolParlanteSubWoofer());
                } else if (opcion2==10) {
                 
                } else {
                System.out.println("Opcion invalida.");
                }
            //fin de opciones de parlantes
            //inicio de opciones de reproduccion
            } else if (opcion == 2){
                System.out.println("Inserte el numero que corresponde a lo que desea hacer: ");
                System.out.println("1- Reproducir la lista de reproduccion en orden");
                System.out.println("2- Reproducir la lista de reproduccion aleatoriamente");
                System.out.println("3- Mostrar lista de canciones");
                System.out.println("4- Agregar cancion");
                System.out.println("5- Eliminar cancion");
                System.out.println("6- Reproducir la radio");
                System.out.println("7- Salir");
                opcion2 = u.nextInt();
                if (opcion2 == 1){
                    System.out.println("Reproduciendo: ");
                    for(int i=0;i<1000;i++){ 
                        if(listaAudios[i].equals("")==false){ 
                        System.out.println(listaAudios[i]); 
                        }
                    }
                    System.out.println("En los parlantes: ");
                    if (nuevo.isParlanteDerecho()==false){
                        System.out.println("Parlante Derecho : no");
                    } if (nuevo.isParlanteDerecho()==true) {
                        System.out.println("Parlante Derecho : si");
                    } if (nuevo.isParlanteIzq()==false) {
                        System.out.println("Parlante Izquierdo : no");
                    } if (nuevo.isParlanteDerecho()==true) {
                        System.out.println("Parlante Izquierdo : si");
                    } if (nuevo.isParlanteSubWoofer()==false) {
                        System.out.println("Parlante Subwoofer : no");
                    } if (nuevo.isParlanteDerecho()==true) {
                        System.out.println("Parlante Subwoofer : si");
                    }
                } else if (opcion2 == 2){
                    System.out.println("Reproduciendo: ");
                    for(int i=((int)Math.random()*999)+1;i<1000;i++){ 
                        if(listaAudios[i].equals("")==false){ 
                        System.out.println(listaAudios[i]); 
                        }
                    }
                    System.out.println("En los parlantes: ");
                    if (nuevo.isParlanteDerecho()==false){
                        System.out.println("Parlante Derecho : no");
                    } if (nuevo.isParlanteDerecho()==true) {
                        System.out.println("Parlante Derecho : si");
                    } if (nuevo.isParlanteIzq()==false) {
                        System.out.println("Parlante Izquierdo : no");
                    } if (nuevo.isParlanteDerecho()==true) {
                        System.out.println("Parlante Izquierdo : si");
                    } if (nuevo.isParlanteSubWoofer()==false) {
                        System.out.println("Parlante Subwoofer : no");
                    } if (nuevo.isParlanteDerecho()==true) {
                        System.out.println("Parlante Subwoofer : si");
                    }
                } else if (opcion2 == 3){
                    for(int i=0;i<1000;i++){ 
                        if(listaAudios[i].equals("")==false){ 
                        System.out.println(listaAudios[i]); 
                        }
                    }
                } else if (opcion2 == 4){
                    System.out.println("Inserte la posicion donde quiere ingresar el codigo binario del audio: ");
                    n = u.nextInt();
                    if (listaAudios[n].equals("")){
                        System.out.println("Inserte el codigo binario del nuevo audio");
                        listaAudios[n] = u.next();
                    } else {
                        System.out.println("Esa posicion ya esta ocupada.");
                    }
                        
                } else if (opcion2 == 5){
                    System.out.println("Inserte la posicion del audio que desea eliminar: ");
                    n = u.nextInt();
                    if (listaAudios[n].equals("")){
                        System.out.println("Esa posicion ya esta vacia.");
                    } else {
                        listaAudios[n] = "";
                        System.out.println("Audio eliminado.");
                    }
                } else if (opcion2 == 6){
                    System.out.println("Reproduciendo '86.23'");
                    System.out.println("En los parlantes: ");
                    if (nuevo.isParlanteDerecho()==false){
                        System.out.println("Parlante Derecho : no");
                    } if (nuevo.isParlanteDerecho()==true) {
                        System.out.println("Parlante Derecho : si");
                    } if (nuevo.isParlanteIzq()==false) {
                        System.out.println("Parlante Izquierdo : no");
                    } if (nuevo.isParlanteDerecho()==true) {
                        System.out.println("Parlante Izquierdo : si");
                    } if (nuevo.isParlanteSubWoofer()==false) {
                        System.out.println("Parlante Subwoofer : no");
                    } if (nuevo.isParlanteDerecho()==true) {
                        System.out.println("Parlante Subwoofer : si");
                    }
                } else if (opcion2 == 7){
                    
                } else {
                    System.out.println("Opcion invalida.");
                }
            //fin de opciones de reproduccion
            //inicio de alarma
            } else if (opcion == 3){
                System.out.println("Ingrese la hora a la que desea la alarma: ");
                hora = u.nextInt();
                System.out.println("Ingrese el minuto al que desea la alarma: ");
                minuto = u.nextInt();
                System.out.println("Su alarma esta programada para las " + hora +":" + minuto);
            //fin de alarma
            //inicio de salir
            } else if (opcion == 4){
                repetir = 1;
            //fin de salir
            //inicio de error
            } else {
                System.out.println("Opcion invalida.");
            //fin de error y de codigo
            }
        }
    }
}
