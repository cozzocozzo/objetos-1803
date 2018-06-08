
package arreglos;

/**
 *
 * @author T-101
 */
public class Arreglos1 {
    public static void main(String[] args) {
        
        int []valores={1,-20,4};//los corchetes indican la declaracion de un arreglo 
        
        for(int i=0; i<valores.length; i++){
            System.out.println(valores[i]);//el indice se pone entre los corchetes, esta forma es para iterar
        }
        //Este ciclo for es el mejorado y se recomienda siempre
        
        for(int v:valores){
            System.out.println(v);
        }
        
        
        //segunda forma de inicializar los arreglos
        int otro[]= new int [4];//esta forma no se recomienda tanto; se especifica el tamaño de 4 elementos 
        for(int valor:otro){
            System.out.println(valor);
        }
    
    
    }
 
}
