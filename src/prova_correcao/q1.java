package prova_correcao;
import java.util.Scanner;

public class q1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do funcionário: ");
        String nome = sc.nextLine();

        System.out.println("Quantidade de horas trabalhadas: ");
        double horasTrabalhadas = sc.nextDouble();
        if (horasTrabalhadas < 0) {
            System.out.println("Erro: menor que 0.");
            return;
        }

        System.out.println("Valor recebido por hora: ");
        double valorHora = sc.nextDouble();
        if (valorHora < 0) {
            System.out.println("Erro: menor que 0.");
            return;
        }

        System.out.println("Percentual de desconto do INSS: ");
        double percentualINSS = sc.nextDouble();
        if (percentualINSS < 0) {
            System.out.println("Erro: menor que 0.");
            return;
        }

        System.out.println("Percentual de desconto do vale-transporte: ");
        double percentualValeTransporte = sc.nextDouble();
        if (percentualValeTransporte < 0) {
            System.out.println("Erro: menor que 0.");
            return;
        }

        System.out.println("Percentual de bônus por produtividade: ");
        double percentualProdutividade = sc.nextDouble();
        if (percentualProdutividade < 0) {
            System.out.println("Erro: menor que 0.");
            return;
        }

        // Nome
        System.out.println("\n ----- Nome do funcionário: "+nome+" -----");

        // 1
        double salarioBruto = horasTrabalhadas * valorHora;
        System.out.println("Salário Bruto: R$"+salarioBruto);

        // 2
        double descontoINSS = salarioBruto * (percentualINSS/100);
        System.out.println("Desconto INSS: R$"+descontoINSS);

        // 3
        double descontoValeTransporte = salarioBruto * (percentualValeTransporte/100);
        System.out.println("Desconto do vale-transporte: R$"+descontoValeTransporte);

        // 4
        double bonusProdutividade =  salarioBruto * (percentualProdutividade/100);
        System.out.println("Bônus de produtividade: R$"+bonusProdutividade);

        // 5
        double salarioLiquido =  salarioBruto - descontoINSS - descontoValeTransporte + bonusProdutividade;
        System.out.println("Salário liquido: R$"+salarioLiquido+"\n");
    }
}
