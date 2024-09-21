package unidade2.exercicio2;

import java.time.LocalDateTime;

public class ProdutoPerecivel extends Produto {

    private LocalDateTime validade;


    public ProdutoPerecivel(String nome, int quantidade, LocalDateTime validade) {
        super(nome, quantidade);
        this.validade = validade;
    }

    public LocalDateTime getValidade() {
        return validade;
    }

    public void setValidade(LocalDateTime validade) {
        this.validade = validade;
    }   
    public void verificarValidade(){
        System.out.println("Lascou, tem validade");
    }

    @Override
    public String toString() {
        return "ProdutoPerecivel [validade=" + validade + "]";
    }

    
}
