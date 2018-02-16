
package poliejemplo;

/**
 *
 * @author juan_
 */
public class Perro extends Animal implements ComportamientoAnimal{

 

  

    @Override
    public void hacerRuido() {
        System.out.println("guau-guau-guau");
    }
    
}