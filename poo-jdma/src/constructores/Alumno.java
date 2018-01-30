
package constructores;

public class Alumno {
    
    private String nombre;
    private int edad;
    private boolean aprobado;


    public Alumno(int x){
        
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the aprobado
     */
    public boolean isAprobado() {
        return aprobado;
    }

    /**
     * @param aprobado the aprobado to set
     */
    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }

    
}
