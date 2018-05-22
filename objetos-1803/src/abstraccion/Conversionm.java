/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author T-101
 */
public class Conversionm {
    Metros metros;
    public float MetrosAPies(){
        //Este metodo tiene logica 
     float resultado= metros.getmetros*3.3;
        return resultado;
    }

    public Metros getMetros() {
        return metros;
    }

    public void setMetros(Metros metros) {
        this.metros = metros;
    }
    
    
}
