public class BreakContinue {
    public static void main(String[] args) {
        System.out.println("  ");
        System.out.println("Break");
        for(int numero = 1; numero <= 5; numero ++) {
            if (numero == 4) {
                break; // Interrompe o laço
            }

            System.out.println(numero);
        }
        System.out.println("  ");
        System.out.println("Continue");
        for(int par = 0; par <= 20; par ++) {
            if (par % 2 != 0) { // imprime os números pares ---- ímpar: % 2 != 0
                continue; // Pula um valor específico
            }
            
            System.out.println(par);
        }
    }
}

