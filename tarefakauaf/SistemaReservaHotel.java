public class SistemaReservaHotel {
    private static final double PRECO_QUARTO_SIMPLES = 200.00;
    private static final double MULTIPLICADOR_EXECUTIVO = 1.5;
    private static final double MULTIPLICADOR_SUITE_PRESIDENCIAL = 3.0 * MULTIPLICADOR_EXECUTIVO;

    public String reservarHotel(String tipoQuarto, int numeroPessoas) {
        double precoPorPessoa;
        if (tipoQuarto.equalsIgnoreCase("Suíte Presidencial")) {
            precoPorPessoa = PRECO_QUARTO_SIMPLES * MULTIPLICADOR_SUITE_PRESIDENCIAL;
        } else if (tipoQuarto.equalsIgnoreCase("Executivo")) {
            precoPorPessoa = PRECO_QUARTO_SIMPLES * MULTIPLICADOR_EXECUTIVO;
        } else {
            precoPorPessoa = PRECO_QUARTO_SIMPLES;
        }
        double precoTotal = precoPorPessoa * numeroPessoas;
        return "Quarto: " + tipoQuarto + ", Preço: R$ " + precoTotal + " para " + numeroPessoas + " pessoas";
    }
}
