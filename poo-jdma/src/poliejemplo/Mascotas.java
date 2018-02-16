package poliejemplo;

import java.util.*;

/**
 *
 * @author juan_
 */
public class Mascotas {

    public static void main(String[] args) {
        Animal animales[] = new Animal[12];
        animales[0] = new Gato();
        animales[1] = new Gato();
        animales[2] = new Gato();

        animales[3] = new Perro();
        animales[4] = new Perro();

        animales[5] = new Pollo();
        animales[6] = new Pollo();
        animales[7] = new Pollo();
        animales[8] = new Pollo();
        animales[9] = new Pollo();
        
        animales[10] = new Raton();
        animales[11] = new Raton();
        
        ServicioAnimales s = new ServicioAnimales();
    
        for (Animal a : animales) {
            s.servicioHacerRuido((ComportamientoAnimal) a);
        }
        
        //Vamos a generar un ArrayList y poner alli algunos animales
        ArrayList<Animal> animalitos = new ArrayList<>();
        animalitos.add(new Pollo());
        animalitos.add(new Raton());
        animalitos.add(new Gato());
        animalitos.add(new Perro());
        animalitos.add(new Raton());
        
        for(Animal a: animalitos){
            s.servicioHacerRuido((ComportamientoAnimal) a);
        }
        
        animalitos.get(0).setEdad(1);
        System.out.println(animalitos.get(0).getEdad());
        
           

    }
}