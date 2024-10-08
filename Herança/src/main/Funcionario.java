//3. Criação de uma Hierarquia de Classes
//○ Objetivo: Crie uma classe Funcionario com atributos nome e salario. Em
//seguida, crie duas subclasses: Gerente e Desenvolvedor. Adicione um
//método calcularBonus que retorna um valor diferente para cada tipo de
//funcionário (por exemplo, 20% do salário para Gerente e 10% para
//Desenvolvedor). Utilize protected para permitir que as subclasses
//acessem os atributos da classe base de forma segura.

//4. Sobrescrita de Métodos
//○ Objetivo: Na classe Funcionario, crie um método trabalhar(), que
//imprime uma mensagem genérica sobre o trabalho realizado. Nas
//subclasses Gerente e Desenvolvedor, sobrescreva esse método para
//especificar o tipo de trabalho realizado por cada um. Utilize a anotação
//@Override e explore como ela ajuda a garantir que a sobrescrita foi feita
//corretamente.

// Classe base Funcionario
public class Funcionario {
    protected String nome;
    protected double salario;

    // Construtor da classe Funcionario
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            throw new IllegalArgumentException("O salário não pode ser negativo.");
        }
    }

    // Método para calcular bônus (genérico)
    public double calcularBonus() {
        return 0;
    }

    // Método para simular trabalho (genérico)
    public void trabalhar() {
        System.out.println("Realizando trabalho genérico.");
    }

    // Método main para testar a hierarquia de classes
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Alice", 5000.00);
        Funcionario desenvolvedor = new Desenvolvedor("Bob", 4000.00);

        gerente.trabalhar();
        System.out.println("Bônus do Gerente: " + gerente.calcularBonus());

        desenvolvedor.trabalhar();
        System.out.println("Bônus do Desenvolvedor: " + desenvolvedor.calcularBonus());
    }
}

// Subclasse Gerente
class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return this.salario * 0.20;
    }

    @Override
    public void trabalhar() {
        System.out.println("Gerenciando a equipe.");
    }
}

// Subclasse Desenvolvedor
class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return this.salario * 0.10;
    }

    @Override
    public void trabalhar() {
        System.out.println("Desenvolvendo software.");
    }
}