package prova01;


// CLASSE - o molde que define como um Carro vai ser
class Carro {
    // ATRIBUTOS - dados/estado do objeto
    String marca;
    String modelo;
    int velocidade;

    // CONSTRUTOR - chamado com "new Carro(...)", inicializa os atributos
    // PARÂMETROS - os dados que você passa na hora de criar o objeto
    Carro(String marca, String modelo) {
        this.marca = marca; // "this" - atributo da classe
        this.modelo = modelo; // o parâmetro tem o mesmo nome, então precisa do "this"
        this.velocidade = 0;
    }

    // METODO COM PARÂMETRO - recebe um valor e age sobre o objeto
    // "void" = não retorna nada
    void acelerar(int km) {
        velocidade += km;
        System.out.println("Marca " + marca + " | Modelo: " + modelo + " | Velocidade: " + velocidade);
    }

    // METODO sem parâmetro — apenas exibe informações
    boolean estaAndando() {
        return velocidade > 0; // retorna true se estiver em movimento
    }

    void exibirInfo() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Velocidade: " + velocidade);
    }
}


public class poo {
    public static void main(String[] args) {

        // OBJETO — instância criada a partir da classe Carro
        // "new Carro(...)" chama o construtor
        Carro carro1 = new Carro("Toyota", "Corolla");
        Carro carro2 = new Carro("Honda", "Civic");

        // Cada objeto tem os seus próprios dados, independentes
        carro1.exibirInfo();
        carro2.exibirInfo();

        // CHAMANDO METODO COM PARAMETRO carro1
        carro1.acelerar(60);  // Acelerou 60km
        carro1.acelerar(40);

        // carro2 não foi afetado — cada objeto tem o seu próprio estado
        carro2.exibirInfo();  // ainda Vel: 0

        // METODO COM RETORNO (TRUE OR FALSE)
        System.out.println(carro1.estaAndando());
        System.out.println(carro2.estaAndando());
    }
}
