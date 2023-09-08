
/**
 * do {
 *     Comando para fazer alguma coisa
 * 
 * } while( expressão booleana ) {
 * 
 *      Enquando for verdadeiro
 * }
 * 
 */

import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {

        System.out.println("Discando...");
        do {
            System.out.println("Telefone tocando");
            System.out.println("Não atendeu");

        } while (tocando());
        System.out.println("Atendeu:");
        System.out.println("Alô!!!");

    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println();
        return !atendeu;
    }

}
