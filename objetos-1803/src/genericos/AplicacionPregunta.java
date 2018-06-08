
package genericos;
import java.util.*;

public class AplicacionPregunta {
    
    public static void main(String[] args) {
        //primero generamos las opciones por ser las mas independientes
        Opcion o11=new Opcion();
        o11.setTitulo("Mizcalco");
        o11.setCorrecta(false);
        //seguimos la logica para las otras 3 
        //o11 es la opcion 1 de la pregunta 1 
        Opcion o21=new Opcion();
        o21.setTitulo("Texcoco");
        o21.setCorrecta(false);
        
        Opcion o31=new Opcion();
        o31.setTitulo("Madrid");
        o31.setCorrecta(true);
        
        Opcion o41=new Opcion();
        o41.setTitulo("Ecatepec");
        o41.setCorrecta(false);
        
        //sigue la pregunta
        
        Pregunta p11=new Pregunta();//igual es la pregunta 1 del cuestionario 1
        p11.setTitulo("Cual es la capital de España?");
        //antes del set generamos el array list con las opciones de arriba
        ArrayList<Opcion> opcionesp11= new ArrayList<>();//asi se genera un array list 
        //<Opcion> esto significa que es generico a Opcion
        opcionesp11.add(o11);
        opcionesp11.add(o21);
        opcionesp11.add(o31);
        opcionesp11.add(o41);//hasta aqui solo construimos el array list
        //ahora si este array list lo agregamos a la primer pregunta
        p11.setOpciones(opcionesp11);
        
        //Ahora sigue el cuestionario
        
        Cuestionario c1= new Cuestionario();
        //antes de set debemos generar el array list de preguntas
        ArrayList<Pregunta> preguntas=new ArrayList<>();
        preguntas.add(p11);
        c1.setPreguntas(preguntas);
        
        
        //mostramos la pregunta
        for(Pregunta p:preguntas){
            
            System.out.println(p.getTitulo());
            //hasta aqui solo muestra la pregunta ahora para aparecer las opciones seria:
            
            for(Opcion o:p.getOpciones()){
                
                System.out.println(o.getTitulo()+" "+o.isCorrecta());
            }
            //para un booleano el meto set es el mismo pero el get sera isCorrecta
            
            
                 
            
        }
        
    
    }
    
    
    
    
}
