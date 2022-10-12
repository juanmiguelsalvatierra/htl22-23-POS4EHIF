public abstract class Lampe implements IEvent{
    private String bezeichnung;
    private boolean eingeschalten;

    public Lampe(String bezeichnung, boolean eingeschalten){
        this.bezeichnung = bezeichnung;
        this.eingeschalten = eingeschalten;
    }

    public abstract void giveBack(String bezeichnung, boolean eingeschalten);
}
