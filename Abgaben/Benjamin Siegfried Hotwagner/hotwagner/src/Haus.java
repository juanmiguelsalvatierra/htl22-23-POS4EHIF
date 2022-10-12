import java.util.Random;
import java.util.TimerTask;

public class Haus extends TimerTask {
    static IAktion[] devices = new IAktion[20];
    Random rnd = new Random();
    int notstopcount = 0;
    int timecount = 0;

    public Haus() {
        addListener(new Wohnzimmerlampe("LampeW1", false));
        addListener(new Wohnzimmerlampe("LampeW2", false));
        addListener(new Schlafzimmerlampe("LampeS1", false));
        addListener(new Schlafzimmerlampe("LampeS2", false));
        addListener(new Heizkoerper("HeizkoerperH1", false));
        addListener(new Heizkoerper("HeizkoerperH2", false));
    }
    public void addListener(IAktion o){
        int i = 0;
        while (devices[i]!=null){
            i++;
        }
        devices[i]=o;
    }
    public String[] getEmail(){
        String[] arr = new String[100];
        timecount++;
        if (timecount==4){
            arr[0] = "L1";
            arr[1] = "L0";
            arr[2] = "LW1";
            arr[3] = "LW0";
            arr[4] = "LS1";
            arr[5] = "LS0";
            arr[6] = "H1";
            arr[7] = "H0";
            //arr[8] = "NOTSTOP";//test notstop
            timecount = 0;
        }
        return arr;
    }
    public void statusAendern(String email){
        for (IAktion o:devices) {
            if (o!=null) o.onStatusAendern(email);
        }
    }

    @Override
    public void run() {
        String[] email = getEmail();
        for (String s:email) {
            if (s!=null){
                if (s.equals("NOTSTOP")){
                    notstopcount++;
                }
                else statusAendern(s);
            }
        }
        if (notstopcount > 0){
            //System.out.println(notstopcount);
            notstopcount++;
        }
        if (notstopcount == rnd.nextInt(60,180)){
            Main.t.cancel();
        }
    }
}
