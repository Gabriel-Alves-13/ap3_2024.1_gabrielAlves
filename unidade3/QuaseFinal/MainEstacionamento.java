package unidade3.QuaseFinal;

public class MainEstacionamento {

    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();

        Veiculo veiculo1 = new Veiculo("mzf3040", "VW - Gol");
        Veiculo veiculo2 = new Veiculo("abc1d23", "Fiat - Marea");
        Veiculo veiculo3 = new Veiculo("drf1t244", "GM - Chevette");

        try {
            System.out.println("Adicionando...");
            estacionamento.adicionar(veiculo1);
            estacionamento.adicionar(veiculo2);
            estacionamento.adicionar(veiculo3);
            System.out.println("3 veiculos adicionados.");

            System.out.println("Removendo...");
            estacionamento.remover("aaa1a111");
            estacionamento.remover("abc1d23");
            System.out.println("Um veiculo removido.");
        } catch (VeiculoNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }
}
