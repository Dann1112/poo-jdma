package constructores;
import com.sun.org.apache.xerces.internal.util.DOMUtil;
import javax.swing.*;

public class ProbarConstructores {
    public static void main(String[] args) {
        Alumno a = new Alumno(2);
        System.out.println("Tu edad es: " + a.getEdad());
        int x = 2;
        System.out.println(x);
        JFrame v = new JFrame("Hola");
        v.setSize(200,200);
        v.setVisible(true);
    }
}
