package arreglos;

import java.util.ArrayList;

public class Primero {
    
    public static void main(String[] args){
        
        //Arreglos NO mutables
        int x[] = { 5 , -2, 6};
        
        //Se imprime el primer elemento
        System.out.println(x[0]);
        
        
        //Todos los arreglos no mutables
        //tienen una propiedad para saber su tamaño
        System.out.println(x.length);
        
        //Vamos a iterar el arreglo con un ciclo for
        for(int i=0; i<x.length; i++){
            System.out.println(x[i]);
        }
        
        for(int a:x){
            System.out.println(a);
        }
        
    }
    
}
