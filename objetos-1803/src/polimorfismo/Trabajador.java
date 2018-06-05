
package polimorfismo;

/**
 *
 * @author celes
 */
public abstract class Trabajador {//una clase abstracta lleva abstract pero ya no s epueden crear objetos a partir de ella;su razon es que no se creen objetos a partir de ella porque tiene un metodo que varia dependiento quien los herede.
    private int seguro;
    private String nombre;
    private float sueldoBase;
    public abstract void pagar();//esto es un metodo; esto tambien es implementarlo; el metodo tambien lleva abstract y punto y coma al final 
   
    public int getSeguro() {
        return seguro;
    }

    public void setSeguro(int seguro) {
        this.seguro = seguro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
            
          
}
