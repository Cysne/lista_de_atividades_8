//5. Polimorfismo com Interfaces
//○ Objetivo: Crie uma interface IMeioTransporte com métodos acelerar() e
//frear(). Implemente essa interface em classes Carro, Bicicleta e Trem.
//No método principal, crie um array de IMeioTransporte e percorra-o
//chamando acelerar() e frear() para cada objeto. Utilize polimorfismo
//para que cada tipo de transporte implemente acelerar() e frear() de
//maneira diferente.

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

public class MeioTransporte {
    public static void main(String[] args) {
        IMeioTransporte[] transportes = { new Carro(), new Bicicleta(), new Trem() };
        for (IMeioTransporte transporte : transportes) {
            transporte.acelerar();
            transporte.frear();
        }
    }
}