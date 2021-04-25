package SimpleFactory;

public class ClientClass {
    public static void main(String[] args) {
        Factory factor = new Factory();
        Fruit fruit = factor.CreateFruit("B");
        fruit.eat();
    }
//    public String factory(String FruitName){
//        if(FruitName.equals("Apple"))
//            return "Apple";
//        if(FruitName.equals("Banana"))
//            return "Banana";
//        return null;
//    }
}

