package poo.jdma;

public class PooJDMA {

    public static void main(String[] args) {
        System.out.println("Hola mundo");
        
        //Tenemos que generar antes los objetos de las clases anteriores
        Usuario x = new Usuario();
        x.altura = 1.78f;
        x.peso = 63;
        Imc algo = new Imc();
        algo.u = x;
        
        System.out.println(algo.calcular());
    }
    
}