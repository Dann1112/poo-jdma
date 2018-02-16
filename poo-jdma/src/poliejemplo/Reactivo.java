
import java.util.ArrayList;
import java.util.Random;


public class Reactivo {
    
    private String pregunta;
    private String respuesta;
    private String[] distractores;
    ArrayList<String> respuestas = new ArrayList<>();
    ArrayList<String> respuestasMezcladas = new ArrayList<>();
    
    
    public Reactivo(String pregunta, String respuesta, String [] distractores){
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.distractores = distractores;
        
        respuestas.add(respuesta);
        
        for(String s : distractores){
            respuestas.add(s);
        }
        
        sorteaRespuestas();
    }
    
    private void sorteaRespuestas(){
        Random random = new Random();
        
        ArrayList<Integer> elegidos = new ArrayList<>();
        
        
        Integer rand = random.nextInt(3);
        while(!elegidos.contains(rand)){
            respuestasMezcladas.add(respuestas.get(rand));
            elegidos.add(rand);
            rand = random.nextInt(3);
        }
    }
    
    public String validaRespuesta(char resp){
        
        switch(resp){
                case 'a':
                    if(respuesta.equals(respuestasMezcladas.get(0)))
                        return "Respuesta Correcta";
                    else return "Respuesta Incorrecta";
                    
                case 'b':
                    if(respuesta.equals(respuestasMezcladas.get(1)))
                        return "Respuesta Correcta";
                    else return "Respuesta Incorrecta";
                    
                case 'c':
                    if(respuesta.equals(respuestasMezcladas.get(2)))
                        return "Respuesta Correcta";
                    else return "Respuesta Incorrecta";
                    
                case 'd':
                    if(respuesta.equals(respuestasMezcladas.get(3)))
                        return "Respuesta Correcta";
                    else return "Respuesta Incorrecta";
                    
                default:
                    return "Respuesta Incorrecta";
        }
    }
    
    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String[] getDistractores() {
        return distractores;
    }

    public void setDistractores(String[] distractores) {
        this.distractores = distractores;
    }
    
    
    
}
