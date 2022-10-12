import java.util.Timer;

public class Main {
    public static void main(String[] arg){
        Haus[] haus = new Haus[20];

        haus[0] = new Wohnzimmerlampe(false);
        haus[1] = new Wohnzimmerlampe(false);
        haus[2] = new Schlafzimmerlampe(false);
        haus[3] = new Schlafzimmerlampe(false);
        haus[4] = new Heizkörper(false);

        Haus hause = new Haus();
        hause.addListener(haus[0]);
        hause.addListener(haus[1]);
        hause.addListener(haus[2]);
        hause.addListener(haus[3]);
        hause.addListener(haus[4]);

        Timer t = new Timer();
        t.schedule(haus[20],0,1000);


    }
}
