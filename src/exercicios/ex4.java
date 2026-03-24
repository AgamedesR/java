package exercicios;
import java.util.Scanner;

public class ex4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em celsius: ");
        double celsius = sc.nextDouble();

        double farenheit = (celsius * 9/5) + 32;

        System.out.printf("Temperatura em Farenheit: %.2f%n", farenheit);

        sc.close();
    }
}
