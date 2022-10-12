public class Schlafzimmerlampe extends Lampe{

    public Schlafzimmerlampe(String bezeichnung, boolean eingeschalten) {
        super(bezeichnung, eingeschalten);
    }

    @Override
    public void Aktion(String eventCode) {

        if(eventCode.equals("L1") || eventCode.equals("LW0") || eventCode.equals("LS1")){

            System.out.println("Schlafzimmerlampe " + getBezeichnung() + " ist jetzt eigeschalten!");
            setEingeschalten(true);
        }

        if(eventCode.equals("L0") || eventCode.equals("LS0") || eventCode.equals("H0")){

            System.out.println("Schlafzimmerlampe " + getBezeichnung() + " ist jetzt ausgeschalten!");
            setEingeschalten(false);
        }
    }
}
