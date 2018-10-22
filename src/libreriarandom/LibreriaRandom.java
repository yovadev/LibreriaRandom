package libreriarandom;
import java.util.Iterator;
import java.util.Random;

public class LibreriaRandom {


    public static void main(String[] args) {
        Random dado = new Random();
        int numero;
        
        
        for (int i=0; i<10; i++) {
        /** genera un valor aleatorio de 0 a 6 sumadole 1*/
        numero = dado.nextInt(6);
        System.out.println("el numero es: " + (numero + 1));  
        }

    }

}
