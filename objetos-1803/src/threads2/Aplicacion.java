package threads2;

import java.time.LocalTime;

public class Aplicacion implements Runnable {//implementamos la interface runnable

    public static void main(String[] args) {
        Runnable r = new Aplicacion();// r es una referencia y la iniciamos con el constructor de defecto 
        Thread t1 = new Thread(r);//con esto ya quedo generado el theard
        t1.start();//aqui se inicializa el thread 

    }

    public void run() {//esta es el acompañamiento de la interface runnable
        while (true) {
            LocalTime time = LocalTime.now();
            int hora = time.getHour();
            int minuto = time.getMinute();
            int segundo = time.getSecond();
            System.out.println(hora + ":" + minuto + ":" + segundo);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }

        }

    }

}
