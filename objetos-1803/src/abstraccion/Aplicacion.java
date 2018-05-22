
package abstraccion;


public class Aplicacion {
    public static void main(String[] args) {
        //1.-crear un objeto de tipo grados
        Grados g=new Grados();//consultor de defecto: le da un valor por defecto a los atributos
        //2.-a este objeto le asignamos un valor a su atributo centigrados
        g.setCentigrados(20);
        
        //3.-creamos un objeto de la clase conversion
        
        Conversion c=new Conversion();
        c.setGrados(g);
        //aplicamos el modelo
        
                System.out.println(c.centigradosAFarenheit());
    }
    
}
