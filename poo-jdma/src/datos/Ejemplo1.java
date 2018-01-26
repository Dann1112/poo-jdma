package datos;

public class Ejemplo1 {
    
    public static void main(String args[]){
        byte b=2;
        short s=2;
        int i=2;
        long l=202;
        
        b=(byte)l;
        i=s;
        s=b;
        s=(short)i;
        i=(int)l;
        
        float f=2.0f;
        double d=2.0;
        f=(float)d;
        d=f;
        
        String x="Hola";
        char ch ='h';
        String y = "45";
        String z = "43.2";
        
        double w = Integer.parseInt(y) + Double.parseDouble(z);
        
    }
    
}
