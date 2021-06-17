package Command;

public class Client {
    public static void main(String[] args) {
        AbstractCommand openCommand,closeCommand,changeCommand;

        openCommand = new TVOpenCommand();
        changeCommand = new TVChangeCommand();
        closeCommand = new TVCloseCommand();

        Controller control = new Controller(openCommand,closeCommand,changeCommand);

        control.open();
        control.change();
        control.close();
    }
}
