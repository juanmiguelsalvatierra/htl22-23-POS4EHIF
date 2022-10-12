import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Haus extends TimerTask {
    public IEvent root;
    public Lampe lampe;
    public Wohnszimmerlampe wohnszimmerlampe;
    public Schlafzimmerlampe schlafzimmerlampe;
    public Haus[] haus = new Haus[20];
    public static Random rnd = new Random();
    public String mail;
    public Timer timer;
    public Wohnszimmerlampe temp;
    public Schlafzimmerlampe temporary;

    public void addListener(){
        for (Haus i:
             haus) {
            if (root == null)
        {
            root = root;
        }
        else{
            if (lampe instanceof wohnszimmerlampe){
                root = wohnszimmerlampe;
                wohnszimmerlampe = temp;
                temp = root;
            }
            else {
                if (lampe instanceof schlafzimmerlampe){
                    root = schlafzimmerlampe;
                    schlafzimmerlampe = temporary;
                    temporary = root;
                }
            }
        }
        }
    }

    public String getMail(){
        if (rnd.nextInt(1, 8) * 10 == 10) {
            return mail = "L1";
        }
        else
        {
            if (rnd.nextInt(1, 8) * 10 == 20) {
                return mail = "L0";
            }
            else
            {
                if (rnd.nextInt(1, 8) * 10 == 30) {
                    return mail = "LW1";
                }
                else
                {
                    if (rnd.nextInt(1, 8) * 10 == 40) {
                        return mail = "LW0";
                    }
                    else
                    {
                        if (rnd.nextInt(1, 8) * 10 == 50) {
                            return mail = "LS1";
                        }
                        else
                        {
                            if (rnd.nextInt(1, 8) * 10 == 60) {
                                return mail = "LS0";
                            }
                            else
                            {
                                if (rnd.nextInt(1, 8) * 10 == 70) {
                                    return mail = "H1";
                                }
                                else
                                {
                                    if (rnd.nextInt(1, 8) * 10 == 80) {
                                        return mail = "H0";
                                    }
                                    else
                                    {
                                        if (rnd.nextInt(1, 8) * 10 > 80) {
                                            return mail = "NOTSTOP";
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return mail;
    }



    @Override
    public void run() {
        Timer timer = new Timer(false);
        timer.schedule(this,0,1000);
    }
}
