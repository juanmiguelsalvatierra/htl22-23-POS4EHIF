import java.util.Timer;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Haus haus = new Haus();
        haus.addListener(new Wohnszimmerlampe("1",true));
        haus.addListener(new Wohnszimmerlampe("2",true));
        haus.addListener(new Schlafzimmerlampe("1",true));
        haus.addListener(new Schlafzimmerlampe("2",false));
        haus.addListener(new Heizkoerper("1",false));
        haus.addListener(new Heizkoerper("1",false));

        Timer timer = new Timer(false);
        timer.schedule(haus,0,1000);
    }
}
