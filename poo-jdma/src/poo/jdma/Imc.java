package poo.jdma;

public class Imc {
    //El siguiente atributo es de tipo
    //composicion-agregacion
    Usuario u;
    
    public String calcular(){
        
        float imc = u.peso/(u.altura*u.altura);
        
        return "Aqui aparecera tu resultado es: "+imc;
    }
    
}
