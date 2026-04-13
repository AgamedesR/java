package aula04;

public class teste {
    static void main(String[] args) {
        String nome, apelido;
        nome = "João";
        apelido = nome;
        nome = null;
        System.out.println(apelido);
    }
}
