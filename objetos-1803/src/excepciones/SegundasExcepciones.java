
package excepciones;


public class SegundasExcepciones {
    public static void main(String[] args) {
        int a=2;
        int b=2;
        int arreglo[]={1,2};
        try{
        String numeroMalo= "4";
        int numeroBueno=Integer.parseInt(numeroMalo);
        
        System.out.println(a/b);
        System.out.println(numeroBueno*2);
            System.out.println(arreglo[3]);
        }catch(NumberFormatException e){
            System.out.println("Serias tan pinche amable de meter un numero no un texto puñetas°!!!!");
        }catch(ArithmeticException e){
            System.out.println("Na mames un entero entre otr entero...neta???");
        }catch(Exception e){
            System.out.println("Este indice no existe we " +e.getMessage());//el getmmessage se comunica con el constructor de esta excepcion
        }
        
        



        
        
    }

}
