public class SistemaReservaPassagem {
    private static final double PRECO_CLASSE_ECONOMICA = 500.00;
    private static final double MULTIPLICADOR_EXECUTIVA = 2.5;
    private static final double MULTIPLICADOR_1A_CLASSE = 1.5 * MULTIPLICADOR_EXECUTIVA;

    public String reservarPassagem(String classe, String assento) {
        double preco;
        if (classe.equalsIgnoreCase("1a Classe")) {
            preco = PRECO_CLASSE_ECONOMICA * MULTIPLICADOR_1A_CLASSE;
        } else if (classe.equalsIgnoreCase("Executiva")) {
            preco = PRECO_CLASSE_ECONOMICA * MULTIPLICADOR_EXECUTIVA;
        } else {
            preco = PRECO_CLASSE_ECONOMICA;
        }
        return "Classe: " + classe + ", Assento: " + assento + ", Preço: R$ " + preco;
    }
}
