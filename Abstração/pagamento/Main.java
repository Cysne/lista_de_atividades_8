public class Main {
    public static void main(String[] args) {
        FormaPagamento cartaoCredito = new CartaoCredito("1234567812345678", "12/24", "123");
        FormaPagamento boleto = new Boleto("12345678901234567890123456789012345678901234567");
        FormaPagamento pix = new Pix("chave-pix-exemplo");

        cartaoCredito.processarPagamento(100.0);
        boleto.processarPagamento(200.0);
        pix.processarPagamento(300.0);
    }
}