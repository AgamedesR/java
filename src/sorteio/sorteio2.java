package sorteio;
import java.util.Scanner;
import java.util.Random;

public class sorteio2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero de 1 a 100: ");
        int numero_escolhido = sc.nextInt();

        Random r = new Random();

        int numero_sorteado = r.nextInt(1, 101);

        if (numero_escolhido == numero_sorteado) {
            System.out.println("Parabéns, o seu numero("+numero_sorteado+") foi sorteado!!");
        } else if (Math.abs(numero_escolhido - numero_sorteado) <= 10) {
            System.out.println("Você chegou perto!! O numero era: " + numero_sorteado);
        } else {
            System.out.println("Errou! O numero era: " + numero_sorteado);
        }

        sc.close();
    }
}
