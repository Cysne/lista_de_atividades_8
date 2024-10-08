//5. Polimorfismo com Interfaces
//○ Objetivo: Crie uma interface IMeioTransporte com métodos acelerar() e
//frear(). Implemente essa interface em classes Carro, Bicicleta e Trem.
//No método principal, crie um array de IMeioTransporte e percorra-o
//chamando acelerar() e frear() para cada objeto. Utilize polimorfismo
//para que cada tipo de transporte implemente acelerar() e frear() de
//maneira diferente.

//6. Polimorfismo com Classes Abstratas
//O Objetivo: Crie uma classe abstrata Animal com um método abstrato
//emitirSom(). Crie subclasses Cachorro, Gato e Vaca, cada uma
//implementando emitirSom() de maneira específica. Crie uma lista de
//Animal no método principal e adicione instâncias de cada subclasse. Itere
//sobre a lista e invoque o método emitirSom() para cada animal,
//demonstrando o polimorfismo.

interface IMeioTransporte {
    void acelerar();

    void frear();
}

class Carro implements IMeioTransporte {
    public void acelerar() {
        System.out.println("Carro acelerando");
    }

    public void frear() {
        System.out.println("Carro freando");
    }
}

class Bicicleta implements IMeioTransporte {
    public void acelerar() {
        System.out.println("Bicicleta acelerando");
    }

    public void frear() {
        System.out.println("Bicicleta freando");
    }
}

class Trem implements IMeioTransporte {
    public void acelerar() {
        System.out.println("Trem acelerando");
    }

    public void frear() {
        System.out.println("Trem freando");
    }
}

abstract class Animal {
    abstract void emitirSom();
}

class Cachorro extends Animal {
    void emitirSom() {
        System.out.println("Cachorro latindo");
    }
}

class Gato extends Animal {
    void emitirSom() {
        System.out.println("Gato miando");
    }
}

class Vaca extends Animal {
    void emitirSom() {
        System.out.println("Vaca mugindo");
    }
}

public class MeioTransporte {
    public static void main(String[] args) {
        IMeioTransporte[] transportes = { new Carro(), new Bicicleta(), new Trem() };
        for (IMeioTransporte transporte : transportes) {
            transporte.acelerar();
            transporte.frear();
        }

        Animal[] animais = { new Cachorro(), new Gato(), new Vaca() };
        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}