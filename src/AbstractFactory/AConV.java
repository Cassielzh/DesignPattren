package AbstractFactory;

public class AConV implements AFruitAndVegetables{
    public Vegetables CreateF(String Kind){
        if(Kind.equals("C"))
            return new Cabbage();
        if(Kind.equals("T"))
            return new Tomato();
        return null;
    }
}
