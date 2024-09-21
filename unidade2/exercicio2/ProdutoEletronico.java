package unidade2.exercicio2;

public class ProdutoEletronico extends Produto {

    private Voltagem volts;

    public ProdutoEletronico(String nome, int quantidade, Voltagem volts) {
        super(nome, quantidade);
        this.volts = volts;
    }

    public Voltagem getVolts() {
        return volts;
    }

    public void setVolts(Voltagem volts) {
        this.volts = volts;
    }

    public void verificarValidade() {
        System.out.println("Tranquilo, não tem validade");
    }

    @Override
    public String toString() {
        return "ProdutoEletronico [volts=" + volts + "]";
        
    
    }
}