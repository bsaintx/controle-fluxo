public class ForArrays {
    public static void main(String[] args) {

        System.out.println("  ");
        System.out.println("For Clássico");
        
        String alunos [] = { "Bruno", "Juliana", "Nathalia", "Maycon", "Marco"};

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no índice x= " + x + " é " + alunos[x]);
        }

        System.out.println("  ");
        System.out.println("ForEach");

        for (String aluno : alunos) {
            System.out.println("Nome do aluno: " + aluno);
        }
    }
}
