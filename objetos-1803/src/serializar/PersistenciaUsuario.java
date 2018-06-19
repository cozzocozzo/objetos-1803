/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;

import java.io.*;
public class PersistenciaUsuario {

//primero guardamos
    public static void guardar(Cliente c)throws Exception{
        //paso 1 generar el archivo donde se va a guardar
        //nuestro serializado
        File file=new File("D:\\archivalo.yomero");
        //paso 2 es indicar que lo vamos a generar para escribirlo en el
        //abrirlo para escrbirlo en el
         FileOutputStream fos= new FileOutputStream(file);
         
         //paso 3 escribir sobre el (un objeo)
         ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        oos.writeObject(c);//se serializa el objeto c
        oos.close();
        
        
    }
    
}
