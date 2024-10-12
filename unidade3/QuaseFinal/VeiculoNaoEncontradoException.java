package unidade3.QuaseFinal;

public class VeiculoNaoEncontradoException extends Exception{
    public VeiculoNaoEncontradoException(String placaString) {
        super("Lascou o carro de placa " + placaString + " não encontrado!");
    }

}
