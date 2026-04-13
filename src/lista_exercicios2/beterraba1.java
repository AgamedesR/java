package lista_exercicios2;
import java.util.Scanner;

public class beterraba1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sim = 0, nao = 0, r;

        System.out.print("Usuário 1 - Gosta de beterraba? (1=SIM / 2=NÃO): ");
        r = sc.nextInt();
        if (r == 1) sim++; else nao++;
        System.out.print("Usuário 2 - Gosta de beterraba? (1=SIM / 2=NÃO): ");
        r = sc.nextInt();
        if (r == 1) sim++; else nao++;
        System.out.print("Usuário 3 - Gosta de beterraba? (1=SIM / 2=NÃO): ");
        r = sc.nextInt();
        if (r == 1) sim++; else nao++;
        System.out.print("Usuário 4 - Gosta de beterraba? (1=SIM / 2=NÃO): ");
        r = sc.nextInt();
        if (r == 1) sim++; else nao++;
        System.out.print("Usuário 5 - Gosta de beterraba? (1=SIM / 2=NÃO): ");
        r = sc.nextInt();
        if (r == 1) sim++; else nao++;
        System.out.print("Usuário 6 - Gosta de beterraba? (1=SIM / 2=NÃO): ");
        r = sc.nextInt();
        if (r == 1) sim++; else nao++;
        System.out.print("Usuário 7 - Gosta de beterraba? (1=SIM / 2=NÃO): ");
        r = sc.nextInt();
        if (r == 1) sim++; else nao++;
        System.out.print("Usuário 8 - Gosta de beterraba? (1=SIM / 2=NÃO): ");
        r = sc.nextInt();
        if (r == 1) sim++; else nao++;
        System.out.print("Usuário 9 - Gosta de beterraba? (1=SIM / 2=NÃO): ");
        r = sc.nextInt();
        if (r == 1) sim++; else nao++;
        System.out.print("Usuário 10 - Gosta de beterraba? (1=SIM / 2=NÃO): ");
        r = sc.nextInt();
        if (r == 1) sim++; else nao++;
        System.out.print("Usuário 11 - Gosta de beterraba? (1=SIM / 2=NÃO): ");
        r = sc.nextInt();
        if (r == 1) sim++; else nao++;
        System.out.print("Usuário 12 - Gosta de beterraba? (1=SIM / 2=NÃO): ");
        r = sc.nextInt();
        if (r == 1) sim++; else nao++;
        System.out.print("Usuário 13 - Gosta de beterraba? (1=SIM / 2=NÃO): ");
        r = sc.nextInt();
        if (r == 1) sim++; else nao++;
        System.out.print("Usuário 14 - Gosta de beterraba? (1=SIM / 2=NÃO): ");
        r = sc.nextInt();
        if (r == 1) sim++; else nao++;
        System.out.print("Usuário 15 - Gosta de beterraba? (1=SIM / 2=NÃO): ");
        r = sc.nextInt();
        if (r == 1) sim++; else nao++;

        sc.close();

        System.out.println("\nResultado das respostas: ");
        System.out.println(sim+" Pessoas gostam de beterraba.");
        System.out.println(nao+" Pessoas não gostam de beterraba.\n");
    }
}