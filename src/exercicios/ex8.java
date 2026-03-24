package exercicios;
import java.util.Scanner;

public class ex8 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor em reais (R$): ");
        int reais = sc.nextInt();

        int dolar = reais * 5;

        System.out.println("O valor R$ "+reais+" em dolar é igual a: $"+dolar);
    }
}
