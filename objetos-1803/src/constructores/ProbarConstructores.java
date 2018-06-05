/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author celes
 */
public class ProbarConstructores {
    public static void main(String[] args) {
        //vamos a crear una fruta 
        Fruta f1=new Fruta();//aqui creamos el objeto fruta lo de el lado izquierdo se llama referencia lo del lado derecho es el constructor
        System.out.println("El nombre de la fruta es  "+f1.nombre);
    System.out.println("El precio de la fruta es  "+f1.precio);
    
    float valor;
        //System.out.println(valor);//el constructor es el encargado de dar los valores de defecto no el compilador
    
    }
    
}
