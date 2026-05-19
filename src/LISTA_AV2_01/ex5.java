package LISTA_AV2_01;
import java.util.Scanner;

public class ex5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor A: ");
        int valorA = sc.nextInt();

        if (valorA < 0) {
            System.out.println("\nErro: número negativo.\n");
        } else if (valorA == 0) {
            System.out.println("0! = 1");
        } else {
            long resultado = 1;
            System.out.print(valorA + "! = ");

            for (int i = valorA; i >= 1; i--) {
                System.out.print(i);
                resultado *= i;

                if (i > 1) {
                    System.out.print(" x ");
                }
            }

            System.out.println(" = "+resultado);
        }


    }
}
