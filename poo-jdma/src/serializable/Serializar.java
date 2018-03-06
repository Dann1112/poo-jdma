package serializable;

import java.io.*;

public class Serializar {
    public static void main(String[] args) {
        
        //Primero generamos un Usuario
        Usuario u = new Usuario(20,"Pedro");
        
        //Generamos un modelo de la clase que serializa
        PersistenciaUsuarios p = new PersistenciaUsuarios();
        
        //Ajustamos su atributo usuario
        p.setU(u);
        
        //Ahora si comprimimos
        p.guardar();
        
    }
}
