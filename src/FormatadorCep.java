public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("1234567");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("e = " + e);
            System.err.println("Cep inválido");
        }
    }

    ;

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();
        return "12.345-678";
    }
}
