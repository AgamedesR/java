package aula04;
import java.util.Scanner;

public class ex1 {
    static void main(String[] args) {
        final double SALARIOMINIMO = 1621;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nDigite o seu salario em reais: ");
        double salario = sc.nextInt();

        double diferenca = salario - SALARIOMINIMO;

        System.out.println("\nA difereca enre o salario minimo e de "+(diferenca)+"\n");

        sc.close();
    }
}
