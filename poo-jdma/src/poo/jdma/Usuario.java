package poo.jdma;

public class Usuario {
    //REGLA 1 DE ENCAPSULAMIENTO
    private float peso;
    private float altura;

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso Este es el valor que debes pasar al metodo
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
}   