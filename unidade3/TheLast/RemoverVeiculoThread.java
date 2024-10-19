package unidade3.TheLast;

public class RemoverVeiculoThread extends Thread {
    private final String placa;
    private final Estacionamento estacionamento;

    public RemoverVeiculoThread(Estacionamento estacionamento, String placa) {
        this.placa = placa;
        this.estacionamento = estacionamento;
    }

    @Override
    public void run() {
        try {
            estacionamento.remover(placa);
        } catch (VeiculoNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }



}
