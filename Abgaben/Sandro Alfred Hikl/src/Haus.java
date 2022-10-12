import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Haus extends TimerTask {
    Random rnd  = new Random();
    Timer t;
    String txt = "";
    IControl[] interessent = new IControl[20];
    int icount =0;
    int zeit = 0;
    int notstopzeit, notstopcount = 0;
    public Haus() {
        AddListener(new Wohnzimmerlampe("WZ Lampe 1"));
        AddListener(new Wohnzimmerlampe("WZ Lampe 2"));
        AddListener(new Schlafzimmerlampe("SZ Lampe 1"));
        AddListener(new Schlafzimmerlampe("SZ Lampe 2"));
        AddListener(new Heizkörper("Heizkörper 1"));
        AddListener(new Heizkörper("Heizkörper 2"));
        t = new Timer();
        t.schedule(this, 0, 1000);
    }

    @Override
    public void run() {
        if(zeit == 10) {
            txt = getEmail();
            if(txt == "Notstop") {
                notstopzeit = rnd.nextInt(120) + 60;
            }
                if(notstopcount >= notstopzeit) {
                    t.cancel();
                }

            if(txt != "" && txt != "Notstop") {
                for (int i = 0; i < icount; i++) {
                    interessent[i].Aktion(txt);
                }
            }
        }

        zeit++;
    }

    public String getEmail() {
        return "LW1";
    }

    public void AddListener(IControl t) {
        interessent[icount] = t;
        icount++;
    }

}
