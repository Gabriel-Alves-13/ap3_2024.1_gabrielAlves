package unidade2.exercicio1;

public class MainLanchodete {
    public static void main(String[] args) {
        
        Produto hamburgao = new Produto("hamburgao", 15.00);
        Bebida refri = new Bebida("refri", 5.00, 0.5);
       
        System.out.println(refri);
        System.out.println(hamburgao);
    }

}
