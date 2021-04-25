package AbstractFactory;

public class AConF implements  AFruitAndVegetables{
    public Fruit CreateF(String Kind){
        if(Kind.equals("A"))
            return new Apple();
        if(Kind.equals("B"))
            return new Banana();
        return null;
    }
}
