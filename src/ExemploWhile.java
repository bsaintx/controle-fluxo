/**
 * Estrutura do controle de fluxo while
 * 
 * while (expressão booleana de validação) {
     * // comando que será executado até que a
     * // expressao de valisação torne-se falsa
 * }
 */

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        Double mesada = 60.0;

        while( mesada > 0 ) {
            Double valorDoce = valorAleatorio();

            if( valorDoce > mesada ) {
                valorDoce = mesada;
            }    
            System.out.println("Doce do valor: " + valorDoce + " Adicionando ao carrinho.");
            mesada = mesada - valorDoce;
        }
        
        System.out.println("Mesada: " + mesada);
        System.out.println("Você gastou todo seu dinheiro em doces");
    }
    
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
