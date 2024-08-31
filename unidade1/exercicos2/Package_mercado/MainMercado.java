package unidade1.exercicos2.Package_mercado;

public class MainMercado {
    public static void main(String[] args) {

        Produto escova = new Produto("escova", 10);
        Produto pasta = new Produto("pasta", 10);
        Produto xampu = new Produto("xampu", 10);
        Estoque meuEstoque = new Estoque();
        meuEstoque.adicionarProduto(escova);
        meuEstoque.adicionarProduto(pasta);
        meuEstoque.adicionarProduto(xampu);
        meuEstoque.listarProdutos();
        meuEstoque.removerProduto("xampu");
        meuEstoque.listarProdutos();



    }
 
}
