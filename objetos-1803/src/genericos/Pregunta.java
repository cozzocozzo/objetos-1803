
package genericos;

import java.util.*;//con esto te quita el error de arraylist porque necesita este packete

/**
 *
 * @author celes
 */
public class Pregunta {
private String titulo;
//declaramos el array list
private ArrayList<Opcion> opciones;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Opcion> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<Opcion> opciones) {
        this.opciones = opciones;
    }

}
