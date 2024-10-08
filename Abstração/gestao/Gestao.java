//8. Sistema de Gestão de Funcionários
//○ Objetivo: Crie um sistema que gerencie diferentes tipos de funcionários
//(Gerente, Desenvolvedor, Estagiario). Cada tipo de funcionário deve ter
//uma maneira diferente de calcular o salário e o bônus. Utilize uma
//combinação de herança, polimorfismo e encapsulamento para estruturar
//as classes. Implemente um método calcularFolhaPagamento que itera
//sobre todos os funcionários e calcula o total de salários e bônus. Adicione
//novas funcionalidades, como a possibilidade de promover um funcionário,
//o que altera seu tipo e os cálculos de salário e bônus.

import java.util.List;
import java.util.ArrayList;

abstract class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public abstract double calcularSalario();

    public abstract double calcularBonus();
}

class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 2;
    }

    @Override
    public double calcularBonus() {
        return getSalarioBase() * 0.5;
    }
}

class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 1.5;
    }

    @Override
    public double calcularBonus() {
        return getSalarioBase() * 0.3;
    }
}

class Estagiario extends Funcionario {
    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }

    @Override
    public double calcularBonus() {
        return getSalarioBase() * 0.1;
    }
}

class Gestao {
    private List<Funcionario> funcionarios;

    public Gestao() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public double calcularFolhaPagamento() {
        double total = 0;
        for (Funcionario funcionario : funcionarios) {
            total += funcionario.calcularSalario() + funcionario.calcularBonus();
        }
        return total;
    }

    public void promoverFuncionario(Funcionario funcionario, String novoCargo) {
        Funcionario novoFuncionario = null;
        if (novoCargo.equals("Gerente")) {
            novoFuncionario = new Gerente(funcionario.getNome(), funcionario.getSalarioBase());
        } else if (novoCargo.equals("Desenvolvedor")) {
            novoFuncionario = new Desenvolvedor(funcionario.getNome(), funcionario.getSalarioBase());
        } else if (novoCargo.equals("Estagiario")) {
            novoFuncionario = new Estagiario(funcionario.getNome(), funcionario.getSalarioBase());
        }
        if (novoFuncionario != null) {
            funcionarios.remove(funcionario);
            funcionarios.add(novoFuncionario);
        }
    }
}