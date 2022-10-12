public abstract class Lampe implements IEventCodes{

    private String bezeichnung;
    private boolean eingeschalten = false;

    public Lampe(String bezeichnung, boolean eingeschalten) {
        this.bezeichnung = bezeichnung;
        this.eingeschalten = eingeschalten;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setEingeschalten(boolean eingeschalten) {
        this.eingeschalten = eingeschalten;
    }
}
