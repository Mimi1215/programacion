///michell Rivera seccion 11 trayecto 1-2
package Caracteres;


import java.io.IOException;
import java.util.Scanner;

public class Caracteres {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String texto;
        char caracter;
        int numeroDeVeces = 0;
        do {
            System.out.println("Introduce texto: ");
            texto = sc.nextLine();
        } while (texto.isEmpty());
        System.out.print("Introduce un carácter: ");
        caracter = (char) System.in.read();
        numeroDeVeces = contarCaracteres(texto, caracter);
        System.out.println("El caracter " + caracter + " aparece " + numeroDeVeces + " veces");                   
    }

  
    public static int contarCaracteres(String cadena, char caracter) {
        int posicion, contador = 0;
       
        posicion = cadena.indexOf(caracter);
        while (posicion != -1) { 
            contador++; 
           
            posicion = cadena.indexOf(caracter, posicion + 1);
        }
        return contador;
   }
}

