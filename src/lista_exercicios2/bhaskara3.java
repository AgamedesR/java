package lista_exercicios2;
import java.util.Scanner;

public class bhaskara3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nDigite o coeficiente de a: ");
        double a = sc.nextDouble();
        System.out.println("Digite o coeficiente de b: ");
        double b = sc.nextDouble();
        System.out.println("Digite o coeficiente de c: ");
        double c = sc.nextDouble();

        sc.close();

        final double  DELTA = (b * b) - (4 * a * c);
        System.out.println("\nDelta: " + DELTA);

        if (DELTA > 0) {
            double x1 = (-b + Math.sqrt(DELTA)) / (2 * a);
            double x2 = (-b - Math.sqrt(DELTA)) / (2 * a);
            System.out.println("A equação possui duas raízes reais:");
            System.out.println("x' = " + x1);
            System.out.println("x'' = " + x2+"\n");
        } else if (DELTA == 0) {
            double x = -b / (2 * a);
            System.out.println("A equação possui uma raiz real:");
            System.out.println("x' = x'' = " + x+"\n");
        } else {
            System.out.println("A equação não possui raízes reais (delta negativo).\n");
        }
    }
}