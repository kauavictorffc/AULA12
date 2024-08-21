public class SistemaAluguelCarro {
    private static final double PRECO_DIARIA_ECONOMICA = 150.00;
    private static final double MULTIPLICADOR_EXECUTIVO = 2.0;
    private static final double MULTIPLICADOR_LUXO = 2.0 * MULTIPLICADOR_EXECUTIVO;

    public String reservarCarro(String tipoCarro) {
        double preco;
        if (tipoCarro.equalsIgnoreCase("Luxo")) {
            preco = PRECO_DIARIA_ECONOMICA * MULTIPLICADOR_LUXO;
        } else if (tipoCarro.equalsIgnoreCase("Executivo")) {
            preco = PRECO_DIARIA_ECONOMICA * MULTIPLICADOR_EXECUTIVO;
        } else {
            preco = PRECO_DIARIA_ECONOMICA;
        }
        return "Carro: " + tipoCarro + ", Preço: R$ " + preco;
    }
}
