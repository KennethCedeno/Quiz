/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz3;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Kenneth Cedeno
 */
public class Test {
    
    public static boolean buscarNumero(int[] arreglo, int numero) {
  return Arrays.asList(arreglo)
    .contains(numero);
   }
    
    public static void main(String[] args){
        Scanner papaya = new Scanner(System.in);
        int n;
        int resultado = 0;
       
        
        
        System.out.println("Inserte el numero de ingredientes que desea en su pizza: ");
        n = papaya.nextInt();
        
        int ingredientes[] = new int[n];
       
        System.out.println("Codigos: \n Queso=16 \n Jamon=17 \n Salame=18 \n Hongos=19");
        
        for(int j=0; j<n; j++) {
            System.out.println("Inserte el codigo del ingrediente "+(j+1)+": ");
            ingredientes[j] = papaya.nextInt();
            
        }
        
        Arrays.asList(ingredientes);
        
        if(buscarNumero(ingredientes, 16)){
            resultado = resultado + 2500;
        } 
        if(buscarNumero(ingredientes, 17)){
            resultado = resultado + 3500;
        } 
        if(buscarNumero(ingredientes, 18)){
            resultado = resultado + 1500;
        } 
        if(buscarNumero(ingredientes, 19)){
            resultado = resultado + 5600;
        }
        
        System.out.println("El precio de su pizza es: "+resultado);
    }
}
