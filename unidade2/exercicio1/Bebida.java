package unidade2.exercicio1;

public class Bebida extends Produto {

    Double volume;

    public Bebida(String nome, Double preco, Double volume) {
        super(nome, preco);
        this.volume = volume;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    
}
