package unidade2.exercicio2;

public class MainMercado {


    public static void main(String[] args) {
        Produto ProdutoPerecivel = new ProdutoPerecivel("leite", 10, null);
        Produto ProdutoEletronico = new ProdutoEletronico("Celular", 1, Voltagem.VOLTA_12V);
        Produto ProdutoVestuario = new ProdutoVestuario("Camisa", 8,"GG");
        
        ProdutoPerecivel.verificarValidade();
       ProdutoEletronico.verificarValidade();
        ProdutoVestuario.verificarValidade();

    
    
    }

}
