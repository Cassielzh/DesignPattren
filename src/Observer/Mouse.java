package Observer;

public class Mouse implements MyObserver{

    @Override
    public void response() {
        System.out.println("老鼠努力奔跑！");
    }
}
