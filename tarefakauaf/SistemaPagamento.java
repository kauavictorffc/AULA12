public class SistemaPagamento {
    public double calcularValorFinal(double valorBase, String metodoPagamento, int parcelas) {
        double valorFinal = valorBase;
        if (metodoPagamento.equalsIgnoreCase("PIX")) {
            valorFinal *= 0.9;
        } else if (metodoPagamento.equalsIgnoreCase("Boleto")) {
            valorFinal *= 0.95;
        } else if (metodoPagamento.equalsIgnoreCase("Crédito") && parcelas > 1) {
            double juros = 0.0399 * parcelas;
            valorFinal *= (1 + juros);
        }
        return valorFinal;
    }

    public String realizarPagamento(double valor, String metodoPagamento, int parcelas) {
        double valorFinal = calcularValorFinal(valor, metodoPagamento, parcelas);
        return "Método de Pagamento: " + metodoPagamento + ", Valor Final: R$ " + valorFinal + ", Parcelas: " + parcelas;
    }
}
