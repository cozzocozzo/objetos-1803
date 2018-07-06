
package figuras_geometricas_excepciones2;



public class AplicacionFiguras {
 
    public static void main(String[] args) {
        
        try {
            //Primero creamos u objeto de tipo cuadrado
            Cuadrado c=new Cuadrado();
            
            //ajustamos el valor del lado
            ValidarValor.validarNoNegativo(-4);
            
            c.setLado(4);
            //generamos un objeto de tipo calculos
            Calculos cal = new Calculos();
            System.out.println(cal.calcularArea(c) );
            
            
        } catch (ValorNegativoException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
}
