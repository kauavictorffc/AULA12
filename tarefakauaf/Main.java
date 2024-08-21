public class Main {
    public static void main(String[] args) {
        PacoteViagemFacade pacoteViagem = new PacoteViagemFacade();

        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria Santos", "987.654.321-00");
        Cliente[] clientes = {cliente1, cliente2};

        String classeVoo = "1a Classe";
        String assento = "1A";
        String tipoQuarto = "Suíte Presidencial";
        int numeroPessoas = 2;
        String tipoCarro = "Luxo";
        String metodoPagamento = "Crédito";
        int parcelas = 6;

        pacoteViagem.comprarPacote(clientes, classeVoo, assento, tipoQuarto, numeroPessoas, tipoCarro, metodoPagamento, parcelas);
    }
}
