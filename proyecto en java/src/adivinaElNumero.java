import java.util.Scanner;

public class adivinaElNumero {
    private Scanner entrada = new Scanner(System.in);
    private  boolean juegoActivo = true;


    public void jugar(){
        System.out.println("hola cual es tu nombre?");
        String nombreJugador = entrada.nextLine();
        System.out.printf("bienvenido %s, vamos a jugar\n", nombreJugador);

        while (juegoActivo){
            int intentos=0;
            int min=0;
            int max=100;
            int numJuego = (int) (Math.random() * ((max - min) + 1));

            System.out.printf("%s, he escogido un entre %d y%d, intenta adivinarlo\n", nombreJugador,min,max);
            int numJugador;


            do {
                System.out.println("escoge un numero");
                numJugador = entrada.nextInt();
                if (numJuego < numJugador) {

                    System.out.println("muy alto");
                } else if (numJuego > numJugador) {
                    System.out.println("muy bajo, intenta otra vez ");
                }
                intentos++;
            }while (numJuego!=numJugador);

            System.out.printf("has ganado, cantidad de intentos: %d",intentos);


            juegoActivo=false;

        }


    }



}
