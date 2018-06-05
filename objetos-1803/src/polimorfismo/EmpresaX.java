
package polimorfismo;

/**
 *
 * @author celes
 */
public class EmpresaX {
    public static void main(String[] args) {
        //23<3
        //vamos a generar 2 trabajadores de plata, 3 de honorarios y 1 de proyecto
        Planta p1= new Planta();
        Planta p2= new Planta();
        Honorarios h1= new Honorarios();
        Honorarios h2= new Honorarios();
        Honorarios h3= new Honorarios();
        Proyecto  pro1=new Proyecto();
        //ahora generamos un arreglo de tipo trabajado
        Trabajador []trabajadores={p1, p2, h1, h2, h3, pro1, new Proyecto()/*instanciacion anonima*/ };//este es el polimorfismo mas simple de todos; el arreglo trabajadores es polimorfico porque no metemos objetos de la clase trabajador si no de sus hijos
        for(Trabajador t:trabajadores){//con esta instruccion ya no es necesario el if
            t.pagar();
            
        }
        
        
        
        
        
    }

    
}
