import java.util.Timer;

public class Main {

    public static void main(String[] args){

        Haus haus = new Haus(new Timer());
        haus.addListener();
    }
}