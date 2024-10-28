abstract class Animal {
    public abstract void emitirSom();
}

class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O gato mia");
    }
}

class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro late");
    }
}

class Cavalo extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cavalo relincha");
    }
}

class Leao extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O leão ruge");
    }
}

class Boi extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O boi muge");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal gato = new Gato();
        Animal cachorro = new Cachorro();
        Animal cavalo = new Cavalo();
        Animal leao = new Leao();
        Animal boi = new Boi();
        gato.emitirSom();
        cachorro.emitirSom();
        cavalo.emitirSom();
        leao.emitirSom();
        boi.emitirSom();
    }
}
