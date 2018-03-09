package serializable;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersistenciaUsuarios {

    Usuario u;

    //Generamos el metodo para serializar a nuestro usuario
    public void guardar() {
        //Para serializar el primer paso es generar el archivo fisico donde
        //estara nuestro objeto de tipo usuario
        File file = new File("nuevoArchivo.miext");

        
        try {
            //Despues lo abrimos para escribir sobre el
            FileOutputStream fos = new FileOutputStream(file);
            //Serializamos
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //Guardamos nuestro usuario
            oos.writeObject(u);
            //Ponemos un mensajito
            System.out.println("Objeto Guardado con Exito");
                    
        } catch (Exception e) {

        }
    }

    public Usuario getU() {
        return u;
    }

    public void setU(Usuario u) {
        this.u = u;
    }
    
    public Usuario recobrarUsuario(){
        File file = new File("nuevoarchivo.miext");
        
        Usuario recobrado = null;
        
        try {
            //El proceso inverso
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            recobrado = (Usuario) ois.readObject();
        } catch (Exception e) {
        } 
        
        return recobrado;
        
    }
}
