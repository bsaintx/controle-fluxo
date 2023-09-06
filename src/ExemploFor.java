/**
 
 * Estrtutura do controle de fluxo for
 * 
 * for( bloco de inicialização; expressão boolenana de validação; bloco de atualização) {
 * 
 * }
 * 
 *   // for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
        //     System.out.println("Contando carneirinhos - " + carneirinhos);
        // }
        // System.out.println("Dormiu zZzzZZzzZZz");
 
 * */


public class ExemploFor {
    public static void main(String[] args) {
    
        int numero = 5;

        System.out.println("Tabuada do " + numero + ":");
        System.out.println("  ");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " * " + i + " = " + resultado);
        }
    }
}