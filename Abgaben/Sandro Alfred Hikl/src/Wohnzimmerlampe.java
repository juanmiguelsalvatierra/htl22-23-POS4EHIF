public class Wohnzimmerlampe extends Lampe{
    private String bez;
    private boolean onoff;

    public Wohnzimmerlampe(String bez) {
        super(bez);
    }


    @Override
    public void Aktion(String code) {
        if((code == "L1" || code == "LW1" || code == "LS0")&& getOnoff() != true) {
            System.out.println("Lampe: " + getBez() + " wird eingeschalten");
            setOnoff(true);
        }else if((code == "L0" || code == "LW0" || code =="H0")&& getOnoff() != false) {
            System.out.println("Lampe: " + getBez() + " wird ausgeschalten");
            setOnoff(false);
        }
    }


}
