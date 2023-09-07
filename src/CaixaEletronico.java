public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo = 25.80;
        double valorSolicitado = 28.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
        } else {
            System.out.println("Saldo indisponível.");
        }

        System.out.println("Saldo disponível: " + saldo);
    }
}