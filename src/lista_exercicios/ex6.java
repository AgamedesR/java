package lista_exercicios;
import java.util.Scanner;

public class ex6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu salario: ");
        double salario = sc.nextDouble();

        double bonus = salario * 1.10;

        System.out.println("Salario com bonus: "+ bonus);

        sc.close();
    }
}
