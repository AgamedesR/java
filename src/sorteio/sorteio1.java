package sorteio;
import java.util.Random;

public class sorteio1 {
    static void main(String[] args) {
        Random r = new Random();

        int numero_sorteado = r.nextInt(1, 101);

        System.out.println("\nO Número sorteado foi: "+numero_sorteado+"\n");

    }
}
