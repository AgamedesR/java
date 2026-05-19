package LISTA_AV2_01;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int votosSim = 0;
        int votosNao = 0;
        int opcao;

        System.out.println("---- ENQUETE ----");
        System.out.println("Você quer ter aula na quarta-feira de cinzas?");
        System.out.println("1 - SIM  |  2 - NÃO  |  0 - Encerrar");

        do {
            System.out.print("\nDigite seu voto: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                votosSim++;
                System.out.println("Voto SIM registrado.");
            } else if (opcao == 2) {
                votosNao++;
                System.out.println("Voto NÃO registrado.");
            } else if (opcao != 0) {
                System.out.println("Opção inválida. Digite 1, 2 ou 0.");
            }

        } while (opcao != 0);

        int totalVotos = votosSim + votosNao;

        System.out.println("\n---- RESULTADO DA ENQUETE ----");
        System.out.println("SIM: "+votosSim+" voto(s)");
        System.out.println("NÃO: "+votosNao+" voto(s)");
        System.out.println("Total de votos: "+totalVotos);

        sc.close();
    }
}