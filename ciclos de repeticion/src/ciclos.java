import java.util.Scanner;

public class ciclos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("cuantos datos quiere procesar?");
        int cantidad = entrada.nextInt();


        System.out.printf("ingrese %d datos\n ", cantidad);
        //ciclo for
//        for (int i = 1; i <= cantidad; i++) {
//            System.out.printf("dato %d: ",i);
//            int num =entrada.nextInt();
//            int resultado=num*2;
//            System.out.printf("datos %d procesado: %d\n",i,resultado);

        //}
        //ciclo while
        int c= 1;
        while (c<= cantidad) {
            System.out.printf("dato %d: ",c);
            int num =entrada.nextInt();
            int resultado=num*2;
            System.out.printf("datos %d procesado: %d\n",c,resultado);
            c++;

        }

    }

}