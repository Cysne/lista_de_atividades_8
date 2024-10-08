public class Main {
    public static void main(String[] args) {
        Gestao gestao = new Gestao();

        Funcionario gerente = new Gerente("Alice", 5000);
        Funcionario desenvolvedor = new Desenvolvedor("Bob", 4000);
        Funcionario estagiario = new Estagiario("Charlie", 2000);

        gestao.adicionarFuncionario(gerente);
        gestao.adicionarFuncionario(desenvolvedor);
        gestao.adicionarFuncionario(estagiario);

        System.out.println("Folha de pagamento total: " + gestao.calcularFolhaPagamento());

        gestao.promoverFuncionario(estagiario, "Desenvolvedor");
        System.out.println("Folha de pagamento total após promoção: " + gestao.calcularFolhaPagamento());
    }
}