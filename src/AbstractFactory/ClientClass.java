package AbstractFactory;

public class ClientClass {
    public static void main(String[] args) {
        AConF factorA = new AConF();
        Fruit fruit = factorA.CreateF("A");
        fruit.eat();
        AConV factorB = new AConV();
        Vegetables vegetable = factorB.CreateF("C");
        vegetable.eat();
    }
}

