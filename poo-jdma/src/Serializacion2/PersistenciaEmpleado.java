package Serializacion2;

import serializable.*;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersistenciaEmpleado {

    ArrayList<Empleado> empleados;

    public PersistenciaEmpleado() {
        empleados = new ArrayList<>();
    }
    
    //Generamos el metodo para serializar a nuestro usuario
    public void guardar(Empleado e) {
        //Para serializar el primer paso es generar el archivo fisico donde
        //estara nuestro objeto de tipo usuario
        File file = new File("empleados.yo");
        
        if(file.exists()){
            empleados = buscarTodos();
        }
        
        try {
            //Despues lo abrimos para escribir sobre el
            FileOutputStream fos = new FileOutputStream(file);
            //Serializamos
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //Guardamos nuestro usuario
            empleados.add(e);
            oos.writeObject(empleados);
            //Ponemos un mensajito
            System.out.println("Objeto Guardado con Exito");
                    
        } catch (Exception err) {

        }
    }
    
    
    public ArrayList<Empleado> buscarTodos(){
        File file = new File("empleado.yo");
        try{
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            empleados = (ArrayList<Empleado>) ois.readObject();
        }
        catch(Exception err){
        }
        return empleados;
    }

}
