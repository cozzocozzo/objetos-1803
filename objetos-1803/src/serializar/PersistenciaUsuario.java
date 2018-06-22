/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;

import java.io.*;
import java.util.ArrayList;
import javax.imageio.stream.FileImageInputStream;
public class PersistenciaUsuario {

//primero guardamos
    public static void guardar(Cliente c)throws Exception{
        //paso 1 generar el archivo donde se va a guardar
        //nuestro serializado
        File file=new File("archivalo.yomero");
       //rrayList>Cliente> clientes =new ArrayList<>();
      //f(File.exists()) Leer();
        //paso 2 es indicar que lo vamos a generar para escribirlo en el
        //abrirlo para escrbirlo en el
        FileOutputStream fos= new FileOutputStream(file);
        //uso de arraylist
        
        
        
        //paso 3 escribir sobre el (un objeo)
         ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        oos.writeObject(c);//se serializa el objeto c
        oos.close();
        
        
        
        
        
        
        
 
        
        
        
    
    }
    public static ArrayList<Cliente> leer()throws Exception{
   
   
        //Para leer primero ponemos el archivo
        
        File file=new File("archivalo.yomero");
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois= new ObjectInputStream(fis);
        ArrayList<Cliente> clientes=(ArrayList<Cliente>) ois.readObject();  
        return clientes;
        
    }
    
}
