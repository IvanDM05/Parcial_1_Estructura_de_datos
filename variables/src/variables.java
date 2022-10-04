import java.io.PrintStream;

public class variables {
    public static void main(String[] args) {
        int pizzas = 6;
        int personas = 3;
        int pizzasPorPersona = pizzas / personas;

        System.out.printf("si hay %d pizzas y%d personas, a cada una le toca %d pizzas\n",
               pizzas, personas, pizzasPorPersona);

        String auto = "Ferrati";
        double velocidad = 90.3;
        System.out.printf("el auto %s va a una velocidad de %f km/h \n", auto, velocidad);


        //operacion entre variable de distintos tipos

        int precioLeche=14;
        double precioJamon=35.6;
        int precioHuevo=23;

        double precioTotal=precioLeche+precioJamon+precioHuevo;
        System.out.printf("el precio total es de: %f\n", precioTotal);


    }
}
