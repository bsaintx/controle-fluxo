public class ResultadoNota {
    public static void main(String[] args) {
        int notaAluno = 4;

        if (notaAluno >= 7) {
            System.out.println("Aprovado");
        }

        else if (notaAluno >= 5 && notaAluno <= 7) {
            System.out.println("Prova de Recuperação");
        }

        else {
            System.out.println("Reprovado");
        }
    }
}
