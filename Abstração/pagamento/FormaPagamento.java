// 7. Abstração em um Sistema de Pagamentos
// ○ Objetivo: Crie uma classe abstrata FormaPagamento com métodos
// abstratos processarPagamento(double valor) e validarPagamento().
// Crie classes concretas CartaoCredito, Boleto e Pix que herdam de
// FormaPagamento e implementam os métodos abstratos. Adicione lógica de
// validação específica para cada forma de pagamento e simule um sistema
// que utilize diferentes formas de pagamento.

abstract class FormaPagamento {
    public abstract void processarPagamento(double valor);

    public abstract boolean validarPagamento();
}

class CartaoCredito extends FormaPagamento {
    private String numeroCartao;
    private String validade;
    private String cvv;

    public CartaoCredito(String numeroCartao, String validade, String cvv) {
        this.numeroCartao = numeroCartao;
        this.validade = validade;
        this.cvv = cvv;
    }

    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Pagamento de R$" + valor + " processado com Cartão de Crédito.");
        } else {
            System.out.println("Falha na validação do Cartão de Crédito.");
        }
    }

    @Override
    public boolean validarPagamento() {
        // Lógica de validação do cartão de crédito (exemplo simplificado)
        return numeroCartao.length() == 16 && validade.matches("\\d{2}/\\d{2}") && cvv.length() == 3;
    }
}

class Boleto extends FormaPagamento {
    private String codigoBarras;

    public Boleto(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Pagamento de R$" + valor + " processado com Boleto.");
        } else {
            System.out.println("Falha na validação do Boleto.");
        }
    }

    @Override
    public boolean validarPagamento() {
        // Lógica de validação do boleto (exemplo simplificado)
        return codigoBarras.length() == 47;
    }
}

class Pix extends FormaPagamento {
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Pagamento de R$" + valor + " processado com Pix.");
        } else {
            System.out.println("Falha na validação do Pix.");
        }
    }

    @Override
    public boolean validarPagamento() {
        // Lógica de validação do Pix (exemplo simplificado)
        return chavePix != null && !chavePix.isEmpty();
    }
}