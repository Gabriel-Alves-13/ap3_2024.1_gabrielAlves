package unidade3.TheLast;

public class AdicionarVeiculoThread extends Thread{

    private final Veiculo veiculo;
    private final Estacionamento estacionamento;

    public AdicionarVeiculoThread(Estacionamento estacionamento,Veiculo veiculo){
        this.veiculo = veiculo;
        this.estacionamento = estacionamento;
    }
    @Override
    public void run() {
        estacionamento.adicionar(veiculo);
    }
    }
