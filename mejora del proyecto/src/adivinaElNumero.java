import javax.swing.*;
import java.util.Scanner;

public class adivinaElNumero {
    private Scanner entrada = new Scanner(System.in);
    private  boolean juegoActivo = true;


    public void jugar(){
        String nombreJugador= obtenerNombreJugador();


        while (juegoActivo){
            int intentos=0;
            int min=0;
            int max=100;
            int numJuego = obtenerNumAleatorio(1,100);

            System.out.printf("%s, he escogido un entre %d y%d, intenta adivinarlo\n", nombreJugador,min,max);
            int numJugador;


            do {
                numJugador= escogerNumero();
               mensaje(numJuego,numJugador);
                intentos++;
            }while (numJuego!=numJugador);

            System.out.printf("has ganado, cantidad de intentos: %d",intentos);


            juegoActivo=JugarNuevamente();

        }


    }private int obtenerNumAleatorio (int min, int max){
         return min +  (int) (Math.random() * ((max - min) + 1));

    }

    private String obtenerNombreJugador(){
        System.out.println("hola cual es tu nombre?");
        String nombreJugador = entrada.nextLine();
        System.out.printf("bienvenido %s, vamos a jugar\n", nombreJugador);
        return nombreJugador;
    }

    private int escogerNumero (){
        System.out.println("escoge un numero");
        return entrada.nextInt();


    }
    private void mensaje(int numJuego, int numJugador){
        if (numJuego < numJugador) {

            System.out.println("muy alto");
        } else if (numJuego > numJugador) {
            System.out.println("muy bajo, intenta otra vez ");
        }

    }
    public boolean JugarNuevamente(){
        System.out.println("jugar nuevamente?\n1. si\n2. no");
        int respuesta = entrada.nextInt();
        if (respuesta==1){
            System.out.println("que bueno, jueguemos otra vez");

        } else {
            System.out.println("end game");
            return false;
        }
        return false;
    }

}

