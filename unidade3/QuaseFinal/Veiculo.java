package unidade3.QuaseFinal;

public class Veiculo {
    private String placa;
    private String modelo;
    
    public Veiculo(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }
    
    @Override
    public String toString() {
        return "Veiculo [nome=" + placa + ", quantidade=" + modelo + "]";
    }

}
