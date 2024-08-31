package unidade1.exercicos2.Package_mercado;

import java.util.LinkedList;
import java.util.List;

public class Estoque {
    
    private List<Produto> produtos;

    public Estoque() {
        produtos = new LinkedList<>();
    }

    public void listarProdutos(){
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

    }

    protected void removerProduto(String nomeProduto){
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equals(nomeProduto)){
                produtos.remove(i);
            }
            
        }
        


    }
    protected void adicionarProduto(Produto novoProduto){
        produtos.add(novoProduto);
        
    }

}

