package unidade1.gabarito_aula5;

import java.util.Scanner;

public class TestarAlunoScanner {
    public static void main(String[] args) {
        Aluno umAluno = new Aluno();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do aluno");
        String nomeDoAluno = teclado.nextLine();
        System.out.println("Digite a nota 1: ");
        double nota1 = teclado.nextDouble();
        System.out.println("Digite a nota 2: ");
        double nota2 = teclado.nextDouble();
        System.out.println("Digite a nota 3: ");
        double nota3 = teclado.nextDouble();
        System.out.println("Digite o nome de mamae");
        String nomeDaMae = teclado.next();

        umAluno.setNome(nomeDoAluno);
        umAluno.setNota1(nota1);
        umAluno.setNota2(nota2);
        umAluno.setNota3(nota3);
        umAluno.setNomeDaMae(nomeDaMae);
        //print aluno
        teclado.close();

    System.out.println(umAluno);




    }
}
