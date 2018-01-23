package poo.jdma;

public class Imc {
    //El siguiente atributo es de tipo
    //composicion-agregacion
    Usuario u;
    
    public String calcular(){
        
        float imc = u.getPeso()/(u.getAltura()*u.getAltura());
        
        return "Aqui aparecera tu resultado es: "+imc;
    }
    
}
