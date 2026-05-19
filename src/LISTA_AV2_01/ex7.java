package LISTA_AV2_01;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha = "naodigo";
        String tentativa;

        do {
            System.out.print("Digite a senha: ");
            tentativa = sc.nextLine();

            if (!tentativa.equals(senha)) {
                System.out.println("Você não sabe a senha! =P\n");
            }

        } while (!tentativa.equals(senha));

        System.out.println("Acesso liberado!\n");
    }
}