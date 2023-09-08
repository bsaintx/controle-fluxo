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
    
        int number = 10;

        System.out.println("Tabuada do " + number + ":");
        System.out.println("  ");

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}