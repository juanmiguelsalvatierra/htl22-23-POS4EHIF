import java.util.Timer;

public class Main {
    static Timer t = new Timer();
    public static void main(String[] args) {
        t.schedule(new Haus(), 0, 1000);
    }
}
