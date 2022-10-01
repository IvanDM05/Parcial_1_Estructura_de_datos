import java.util.Scanner;

public class teclado {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        System.out.println("cual es tu nombre ");
        String nombre=entrada.nextLine();
        System.out.println("tu nombre es:" + nombre);

        System.out.println("cual es tu edad?");
        int edad = entrada.nextInt();
        System.out.println("tu edad es: " + edad);
    }
}
