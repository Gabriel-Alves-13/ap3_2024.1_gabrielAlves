package unidade3.TheLast;

public class Estacionamento {

    private int capacidade = 12;
    private Veiculo[] osVeiculos = new Veiculo[capacidade];
    private int contador = 0;

    public void adicionar(Veiculo veiculo) {
        if (contador < capacidade) {
            osVeiculos[contador] = veiculo;
            contador++;
            System.out.println("carro adicionado: " + veiculo.getPlaca());
        } else { 
           // if (contador > capacidade) {
            //asPlacas[contador] = placa;
            //contador++;
            System.out.println("Capacidade máxima atingida. Não é possível gerer vagas.");
        }
    }

    public synchronized void remover(String placaDoVeiculo) throws VeiculoNaoEncontradoException {
        for (int i = 0; i < contador; i++) {
            if (osVeiculos[i].getPlaca().equals(placaDoVeiculo)) {
                osVeiculos[i] = osVeiculos[contador - 1];
                osVeiculos[contador - 1] = null; //perigoso...
                contador--;
                System.out.println("Veiculo removido: " + placaDoVeiculo);
                return;
            }
        }
        throw new VeiculoNaoEncontradoException(placaDoVeiculo);
    }
}


