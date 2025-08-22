// Corrida de veiculos

import java.util.Scanner;

class Veiculo {
    protected String nome;
    protected int velocidade;

    public Veiculo(String nome, int velocidade){
        this.nome = nome;
        this.velocidade = velocidade;
    }

    public String Mover() {
        return "";
    }
}

class Carro extends Veiculo {

    public Carro(String nome, int velocidade) {
        super(nome, velocidade);
    }

    @Override
    public String Mover() {
        return "Vruuuuuuuuum!";
    }
}

class Bicicleta extends Veiculo {

    public Bicicleta(String nome, int velocidade) {
        super(nome, velocidade);
    }

    @Override
    public String Mover() {
        return "Pedalando!";
    }
}

class Moto extends Veiculo {

    public Moto(String nome, int velocidade) {
        super(nome, velocidade);
    }

    @Override
    public String Mover() {
        return "zuuuuuuum!";
    }
}

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro("carro", 80);
        Moto moto = new Moto("moto", 75);
        Bicicleta bicicleta = new Bicicleta("bicicleta", 25);

        System.out.println("Escolha entre os três o primeiro veículo para a competição: Carro | Moto | Bicicleta ");
        String escolha1 = scanner.next();

        System.out.println("Escolha entre os três o segundo veículo para a competiçao:  Carro | Moto | Bicicleta");
        String escolha2 = scanner.next();

        String competicaoEscolhida = escolha1.toLowerCase() + "-" + escolha2.toLowerCase();

        System.out.printf("Veículos escolhidos: %s vs %s \n", escolha1, escolha2);

        switch (competicaoEscolhida) {
            case "carro-bicicleta":
                System.out.println(carro.Mover());
                System.out.println(bicicleta.Mover());
                break;
            case "carro-moto":
                System.out.println(carro.Mover());
                System.out.println(moto.Mover());
                break;
            case "moto-bicicleta":
                System.out.println(moto.Mover());
                System.out.println(bicicleta.Mover());
                break;
            case "moto-carro":
                System.out.println(moto.Mover());
                System.out.println(carro.Mover());
                break;
            case "bicicleta-moto":
                System.out.println(bicicleta.Mover());
                System.out.println(moto.Mover());
                break;
            case "bicicleta-caro":
                System.out.println(bicicleta.Mover());
                System.out.println(carro.Mover());
                break;
            default:
                System.out.println("Escolha entre Carro, Moto e Bicicleta");
        }


    }
}
