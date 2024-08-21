public class PacoteViagemFacade {
    private SistemaReservaPassagem sistemaReservaPassagem;
    private SistemaReservaHotel sistemaReservaHotel;
    private SistemaAluguelCarro sistemaAluguelCarro;
    private SistemaPagamento sistemaPagamento;

    public PacoteViagemFacade() {
        this.sistemaReservaPassagem = new SistemaReservaPassagem();
        this.sistemaReservaHotel = new SistemaReservaHotel();
        this.sistemaAluguelCarro = new SistemaAluguelCarro();
        this.sistemaPagamento = new SistemaPagamento();
    }

    public void comprarPacote(Cliente[] clientes, String classeVoo, String assento, String tipoQuarto, int numeroPessoas, String tipoCarro, String metodoPagamento, int parcelas) {
        System.out.println("==== Resumo da Compra ====");

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        String passagem = sistemaReservaPassagem.reservarPassagem(classeVoo, assento);
        System.out.println(passagem);

        String hotel = sistemaReservaHotel.reservarHotel(tipoQuarto, numeroPessoas);
        System.out.println(hotel);

        String carro = sistemaAluguelCarro.reservarCarro(tipoCarro);
        System.out.println(carro);

        double valorBase = calcularValorBase(passagem, hotel, carro);
        String pagamento = sistemaPagamento.realizarPagamento(valorBase, metodoPagamento, parcelas);
        System.out.println(pagamento);
    }

    private double calcularValorBase(String passagem, String hotel, String carro) {
        double valorBase = 0;

        String[] valoresPassagem = passagem.split("R\\$ ");
        String[] valoresHotel = hotel.split("R\\$ ");
        String[] valoresCarro = carro.split("R\\$ ");

        valorBase += Double.parseDouble(valoresPassagem[1]);
        valorBase += Double.parseDouble(valoresHotel[1].split(" ")[0]);
        valorBase += Double.parseDouble(valoresCarro[1]);

        return valorBase;
    }
}
