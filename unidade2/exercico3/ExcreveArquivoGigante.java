package unidade2.exercico3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ExcreveArquivoGigante {
public static void main(String[] args) {
    

        String[] nomes = { "Gabriel", "Davi", "Maria", "Eshely"};
        String[] departamento = { "Contadores", "Marketing", "T.I." };
		
        String nomeDoArquivo = "funcionarios.csv";

        Random random = new Random();
        boolean append = false;

        try {
            BufferedWriter arquivoCSV = new BufferedWriter(new FileWriter(nomeDoArquivo, append));
            for (long controle = 1; controle <= 8987411; controle++) {
                long idFuncionario = controle;
                String umNome = nomes[random.nextInt(nomes.length)];
                String umDepartamento = departamento[random.nextInt(departamento.length)];
                double salario = 2000 + (20000 - 2000) * random.nextDouble();

                Funcionario funcionario = new Funcionario(idFuncionario, umNome, umDepartamento, salario);
                arquivoCSV.write(funcionario.toString());
                arquivoCSV.newLine();

                if (controle % 1000 == 0) {
                    System.out.println("Progresso: " + controle + " Funcionarios escritos.");
                }
            }
            arquivoCSV.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nAcabou!");
    }
}