import java.util.Random;
import java.util.Timer;

public class Wohnszimmerlampe extends Lampe implements IEvent{
    public Haus interessent;
    public IEvent root;
    public IEvent next;
    public Lampe wohnszimmerlampe;
    public Timer timer;
    Random random;

    public Wohnszimmerlampe(String bezeichnung, boolean eingeschalten) {
        super(bezeichnung, eingeschalten);
    }

    @Override
    public void giveBack(String bezeichnung, boolean eingeschalten) {
        System.out.println("Wohnzimmerlampe: " + bezeichnung + " Status: " + eingeschalten);
    }

    @Override
    public void temp(String mail) {
        if (interessent.getMail()=="L1"){
            System.out.println("Alle Lampen werden eingeschalten");
        }
        else{
            if (interessent.getMail()=="L0"){
                System.out.println("Alle Lampen werden ausgeschalten");
            }
            else{
                if (interessent.getMail()=="LW1"){
                    System.out.println("Lampen in Wohnzimmer werden eingeschalten");
                }
                else{
                    if (interessent.getMail()=="LW0"){
                        System.out.println("Lampen in Wohnzimmer werden ausgeschalten");
                    }
                    else {
                        if (interessent.getMail() == "NOTSTOP") {
                            System.out.println("stopping the game in process.................");
                            timer.schedule(this, 0, (random.nextInt(6,18)*1000));
                        }
                    }
                }
            }
        }
    }

    @Override
    public void setNext() {
        root = next;
    }

    @Override
    public IEvent getNext() {
        return next;
    }
}
