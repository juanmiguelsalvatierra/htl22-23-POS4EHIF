public class Elektroware extends Ware {
    public float watt;

    public Elektroware(String art, float preis, float gewicht, float watt){
        super(art, preis, gewicht);
        this.watt = watt;
    }
}
