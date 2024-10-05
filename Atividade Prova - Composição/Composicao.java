
class Motor {
    public void ligar() {
        System.out.println("Motor ligado!");
    }
}


class Carro {
    private Motor motor;

    public Carro() {
        this.motor = new Motor();
    }

    public void dirigir() {
        motor.ligar();
        System.out.println("Carro em movimento!");
    }
}

public class Composicao {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.dirigir();
    }
}
