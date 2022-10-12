public class Schlafzimmerlampe extends Lampe{
    public Schlafzimmerlampe(String bez) {
        super(bez);
    }

    @Override
    public void Aktion(String code) {
        if((code == "L1" || code == "LS1" || code == "LW0")&& getOnoff() != true) {
            System.out.println("Lampe: " + getBez() + " wird eingeschalten");
            setOnoff(true);
        }else if((code == "L0" || code == "LS0" || code =="H0")&& getOnoff() != false) {
            System.out.println("Lampe: " + getBez() + " wird ausgeschalten");
            setOnoff(false);
        }
    }

}
