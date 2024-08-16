import java.util.LinkedList;

public class TestarListaAlunos {

    public static void main(String[] args) {
        
    
        LinkedList<Aluno>osAlunos=new LinkedList<Aluno>();
        for (int i = 0; i < 89764; i++) {
            Aluno mae = new Aluno();
            mae.setNome ("Mae"+ i);
            mae.setNota1(5);
        
        System.out.println(mae);
        }
    }
}
