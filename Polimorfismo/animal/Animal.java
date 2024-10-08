
// 6. Polimorfismo com Classes Abstratas
// O Objetivo: Crie uma classe abstrata Animal com um método abstrato
// emitirSom(). Crie subclasses Cachorro, Gato e Vaca, cada uma
// implementando emitirSom() de maneira específica. Crie uma lista de
// Animal no método principal e adicione instâncias de cada subclasse. Itere
// sobre a lista e invoque o método emitirSom() para cada animal,
// demonstrando o polimorfismo.
abstract class Animal {
    abstract void emitirSom();
}

class Gato extends Animal {
    @Override
    void emitirSom() {
        System.out.println("Miau");
    }
}

class Vaca extends Animal {
    @Override
    void emitirSom() {
        System.out.println("Muu");
    }
}

class Cachorro extends Animal {
    @Override
    void emitirSom() {
        System.out.println("Au Au");
    }
}

class Pato extends Animal {
    @Override
    void emitirSom() {
        System.out.println("Quack");
    }
}