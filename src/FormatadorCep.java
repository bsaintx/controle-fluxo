public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("24753388");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("Cep inválido");
        }
        
    }
    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();

            return "23.775-123";
    }
}
