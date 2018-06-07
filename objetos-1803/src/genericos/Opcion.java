 
package genericos;

/**
 *
 * @author celes
 */
public class Opcion {
    private String titulo;
    private boolean correcta;//se debe insertar getter y seter encapsulados

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isCorrecta() {
        return correcta;
    }

    public void setCorrecta(boolean correcta) {
        this.correcta = correcta;
    }
    
}
