package unidade2.exercicio1;

public class Produto {

    String nome;
    Double preco;
    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public Produto(String string, double preco) {
        //TODO Auto-generated constructor stub
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    @Override
    public String toString() {
        return "Produto [nome=" + nome + 
        ", preco=" + preco + "]";
    }
    
}
