package unidade2.exercicio2;

public class ProdutoVestuario extends Produto{
    private String tamanho;

    public ProdutoVestuario(String nome, int quantidade, String tamanho) {
        super(nome, quantidade);
        this.tamanho = tamanho;
    }

    public void verificarValidade() {
        System.out.println("Se não ta rasgado, ta tranquilow");
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "ProdutoVestuario [tamanho=" + tamanho + "]";
    }
}
