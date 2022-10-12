public class Wohnzimmerlampe extends Lampe{

    public Wohnzimmerlampe(String bezeichnung, boolean eingeschalten) {
        super(bezeichnung, eingeschalten);
    }

    @Override
    public void Aktion(String eventCode) {

        if(eventCode.equals("L1") || eventCode.equals("LW1") || eventCode.equals("LS0")){

            System.out.println("Wohnzimmerlampe " + getBezeichnung() + " ist jetzt eingeschalten!");
            setEingeschalten(true);
        }

        if(eventCode.equals("L0") || eventCode.equals("LW0") || eventCode.equals("H0")){

            System.out.println("Wohnzimmerlampe " + getBezeichnung() + " ist jetzt ausgeschalten!");
            setEingeschalten(false);
        }
    }
}
