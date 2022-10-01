import java.util.Scanner;

public class condicionales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("calcualdora de propinas");
        System.out.println("ingrese la cantidad a pagar");
        double cantidad = entrada.nextDouble();
        System.out.println("ingrese el % de propina");
        int porcentaje = entrada.nextInt();

//        if (porcentaje < 15 ){
//        System.out.println("el servicio no fue muy bueno ");
//        } else {
//            System.out.println("el servicio fue muy bueno ");
//        }

        if (porcentaje < 15 ){
            System.out.println("el servicio no fue muy bueno ");
        } else if (15 <= porcentaje && porcentaje <30 ){
            System.out.println("el servicio fue muy bueno ");
        } else {
            System.out.println("el servicio fue exelente");
        }
        double total = cantidad+(cantidad * porcentaje/100);
        System.out.printf("el total es de : %.1f", total);


    }
}
