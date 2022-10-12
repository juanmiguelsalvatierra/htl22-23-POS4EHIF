import java.util.Random;
import java.util.Timer;

public class Schlafzimmerlampe extends Lampe implements IEvent{
    public Haus interessant;
    public IEvent root;
    public IEvent next;
    public Timer timer;
    Random random;

    public Schlafzimmerlampe(String bezeichnung, boolean eingeschalten) {
        super(bezeichnung, eingeschalten);
    }

    @Override
    public void giveBack(String bezeichnung, boolean eingeschalten) {
        System.out.println("Schlafzimmerlampe: " + bezeichnung + " Status: " + eingeschalten);
    }

    @Override
    public void temp(String mail) {
        if (interessant.getMail()=="L1"){
            System.out.println("Alle Lampen werden eingeschalten");
        }
        else{
            if (interessant.getMail()=="L0"){
                System.out.println("Alle Lampen werden ausgeschalten");
            }
            else{
                if (interessant.getMail()=="LS1"){
                    System.out.println("Lampen in Schlafzimmer werden eingeschalten");
                }
                else{
                    if (interessant.getMail()=="LS0"){
                        System.out.println("Lampen in Schlafzimmer werden ausgeschalten");
                    } else {
                        if (interessant.getMail() == "NOTSTOP") {
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
