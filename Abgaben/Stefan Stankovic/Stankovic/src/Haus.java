import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Haus extends TimerTask{ //Event Auslöser

    Timer t = new Timer();
    IEMail[] interessenten = new IEMail[20];

    //private IEMail root = null;

    String[] eventCodes = new String[] {"l1", "l0", "lw1", "lw0", "ls1", "ls0", "h1", "h0", null};

    public Haus(){
        interessenten[0] = new Wohnzimmerlampe("wzl1");
        interessenten[1] = new Wohnzimmerlampe("wzl2");
        interessenten[2] = new Schlafzimmerlampe("szl1");
        interessenten[3] = new Schlafzimmerlampe("szl2");
        interessenten[4] = new Heizkörper("hk1");
        interessenten[5] = new Heizkörper("hk2");

        go();
    }

    /* nicht genug zeit dafür genommen
    public void addListener(IEMail listener){

        if (root == null){
            root = listener;
        } else{
            listener.ne
        }

    }*/


    public void go(){
        t.schedule(this, 0, 60000);
    }

    @Override
    public void run() {
        Random rnd = new Random();

        String code = eventCodes[rnd.nextInt(0, 9)];
        System.out.println(code);

       //  6 später umändern damit es nicht gehardcoded ist
        for (int i = 0; i < 6; i++) {
            interessenten[i].getEmail(code);
        }
    }
}
