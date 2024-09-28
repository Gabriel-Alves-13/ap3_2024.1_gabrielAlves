package unidade2.exercico3;

import java.text.NumberFormat;
import java.util.Locale;

class Funcionario {
    private long idFuncionario;
    private String nome;
    private String departamento;
    private double salario;
    
    public Funcionario(long idFuncionario, String nome, String departamento, double salario) {
        this.idFuncionario = idFuncionario;
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }

    @Override
    public String toString() {
        NumberFormat formatoMoeda = 
        NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return idFuncionario + ";" + nome + ";" + departamento + ";" + formatoMoeda.format(salario);
    }
        

}
