//7. Abstração em um Sistema de Pagamentos
//○ Objetivo: Crie uma classe abstrata FormaPagamento com métodos
//abstratos processarPagamento(double valor) e validarPagamento().
//Crie classes concretas CartaoCredito, Boleto e Pix que herdam de
//FormaPagamento e implementam os métodos abstratos. Adicione lógica de
//validação específica para cada forma de pagamento e simule um sistema
//que utilize diferentes formas de pagamento.

//8. Sistema de Gestão de Funcionários
//○ Objetivo: Crie um sistema que gerencie diferentes tipos de funcionários
//(Gerente, Desenvolvedor, Estagiario). Cada tipo de funcionário deve ter
//uma maneira diferente de calcular o salário e o bônus. Utilize uma
//combinação de herança, polimorfismo e encapsulamento para estruturar
//as classes. Implemente um método calcularFolhaPagamento que itera
//sobre todos os funcionários e calcula o total de salários e bônus. Adicione
//novas funcionalidades, como a possibilidade de promover um funcionário,
//o que altera seu tipo e os cálculos de salário e bônus.