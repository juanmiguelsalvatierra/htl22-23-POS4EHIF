import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Haus extends TimerTask {

    IEventCodes wohnzimmerlampe1 = new Wohnzimmerlampe("w1", false);
    IEventCodes wohnzimmerlampe2 = new Wohnzimmerlampe("w2", false);
    IEventCodes schlafzimmerlampe1 = new Schlafzimmerlampe("schlaf1", false);
    IEventCodes schlafzimmerlampe2 = new Schlafzimmerlampe("schlaf2", false);
    IEventCodes heizkörper1 = new Heizkörper("heizkörper1", false);
    IEventCodes heizkörper2 = new Heizkörper("heizkörper2", false);
    public Timer t;
    Random rnd = new Random();

    public Haus(Timer t) {
        t.schedule(this, 0, 60000);
    }

    public void addListener(){

        IEventCodes wohnzimmerlampe1 = new Wohnzimmerlampe("w1", false);
        IEventCodes wohnzimmerlampe2 = new Wohnzimmerlampe("w2", false);
        IEventCodes schlafzimmerlampe1 = new Schlafzimmerlampe("schlaf1", false);
        IEventCodes schlafzimmerlampe2 = new Schlafzimmerlampe("schlaf2", false);
        IEventCodes heizkörper1 = new Heizkörper("heizkörper1", false);
        IEventCodes heizkörper2 = new Heizkörper("heizkörper2", false);
    }


    @Override
    public void run() {

        if(getEmail().equals("NONSTOP")){
            Timer timer = new Timer();
            //timer.schedule(CodeNONSTOP(), 0, (rnd.nextInt(60, 180) * 1000));
        }
        addListener();
        wohnzimmerlampe1.Aktion(getEmail());
        wohnzimmerlampe2.Aktion(getEmail());
        schlafzimmerlampe1.Aktion(getEmail());
        schlafzimmerlampe2.Aktion(getEmail());
        heizkörper1.Aktion(getEmail());
        heizkörper2.Aktion(getEmail());
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    public String getEmail(){

        String eventCode = "LS0";
        return eventCode;
    }

    public void CodeNONSTOP(){
        t.cancel();
    }
}
