//1. Criação de uma Classe Simples
//○ Objetivo: Crie uma classe Produto que represente um produto de uma
//loja. A classe deve ter atributos privados nome, preco e quantidade em
//estoque. Implemente métodos públicos para acessar e modificar esses
//atributos. Garanta que o preço e a quantidade não possam ser negativos.

//2. Melhorando a Classe com Validação
//○ Objetivo: Extenda a classe Produto para incluir um método
//aplicarDesconto(double porcentagem) que reduz o preço do produto.
//Valide para garantir que o desconto não possa ser maior que 50%.
//Implemente a lógica que lança uma exceção se o desconto for inválido.

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        setPreco(preco); 
        setQuantidade(quantidade); 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            throw new IllegalArgumentException("A quantidade não pode ser negativa.");
        }
    }

    public void aplicarDesconto(double porcentagem) {
        if (porcentagem < 0 || porcentagem > 50) {
            throw new IllegalArgumentException("O desconto não pode ser negativo ou maior que 50%.");
        }
        this.preco -= this.preco * (porcentagem / 100);
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 2500.00, 10);
        produto.exibirInfo();

        produto.setNome("Smartphone");
        produto.setPreco(1500.00);
        produto.setQuantidade(5);

        produto.exibirInfo();

        try {
            produto.setQuantidade(-5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            produto.setPreco(-1000.00);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            produto.aplicarDesconto(30);
            System.out.println("Desconto aplicado com sucesso!");
            produto.exibirInfo();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            produto.aplicarDesconto(60);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}