public class Heizkörper implements IEventCodes{

    private String bezeichnung;
    private boolean eingeschalten = false;


    public Heizkörper(String bezeichnung, boolean eingeschalten) {
        this.bezeichnung = bezeichnung;
        this.eingeschalten = eingeschalten;
    }

    @Override
    public void Aktion(String eventCode) {

        if(eventCode.equals("H1")){

            System.out.println("Heizkörper " + bezeichnung + " ist jetzt eingschalten!");
            eingeschalten = true;
        }

        if(eventCode.equals("H0")){

            System.out.println("Heizkörper " + bezeichnung + " ist jetzt ausgschalten!");
            eingeschalten = false;
        }
    }
}

