public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T";

        switch (plano) {
            case "T": {
                System.out.println("5GB Youtube");
            }
            case "M": {
                System.out.println("Whatsapp e Instagram grátis por uma semana");
            }
            case "B" :{
                System.out.println("100 minutos de ligação");
            }
        }
    }
}

/**
 * Use switch-case quando:

 - Você tem uma variável cujo valor será testado em várias condições diferentes.
 - As condições dependem do valor exato da variável e não são complexas.
 - Você deseja um código mais limpo e legível em situações em que várias opções possíveis são conhecidas antecipadamente.
 - Há uma necessidade de otimização de desempenho, pois switch-case é geralmente mais eficiente do que uma série de if-else aninhados em termos de tempo de execução.


 * Use if-else quando:

 - As condições são complexas e não podem ser facilmente mapeadas para um valor específico de variável.
 - Existem várias condições independentes que precisam ser verificadas.
 - As condições são baseadas em expressões booleanas mais gerais.
 - Exemplo de uso de if-else em Java:
 */
