
package constructores2;

import javax.swing.JFrame;


public class ProbarConstructores {
    //en esta va el metodo main
    public static void main(String[] args) {
        
        //vamos a crear un objeto de tipo persona
        Persona p1=new Persona("Alexis");//Los parentesis vacios significan constructor de defecto
        Persona p2=new Persona();
        JFrame ventanita = new JFrame("hOLA MUNDO!!");//esto crea una ventana; es el constructor PERO AL alterarlo ya es un constructor y sale una ventana pero ahora con nombre
        ventanita.setSize(300,300);//30 pixeles es 1 cm aqui sera 10x10cm
        ventanita.setVisible(true);
        
        
        
    }
    
}
