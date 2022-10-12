import java.util.Random;
import java.util.Timer;

public class Heizkoerper implements IEvent{
    public Haus interessant;
    public Haus root;
    public IEvent next;
    Random random;
    public String bezeichnung;
    public boolean eingeschalten;
    public Timer timer;

    public Heizkoerper(String bezeichnung, boolean eingeschalten){
        this.bezeichnung = bezeichnung;
        this.eingeschalten = eingeschalten;
    }

    @Override
    public void temp(String mail) {
        if (interessant.getMail()=="H1"){
            System.out.println("Alle Heizkörper werden eingeschalten");
        }
        else {
            if (interessant.getMail() == "H0") {
                System.out.println("Alle Heizkörper werden eingeaschalten und alle Lampen werden ausgeschalten");
            }
            else {
                if (interessant.getMail() == "NOTSTOP") {
                    System.out.println("stopping the game in process.................");
                    timer.schedule(0, this, (random.nextInt(6,18)*1000));
                }
            }
        }
    }

    @Override
    public void setNext() {
        root = (Haus) next;
    }

    @Override
    public IEvent getNext() {
        return next;
    }
}
