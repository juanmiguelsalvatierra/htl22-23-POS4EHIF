public class Spielware extends Ware{
    public String hersteller;

    public Spielware(String art, float preis, float gewicht, String hersteller) {
        super(art, preis, gewicht);
        this.hersteller = hersteller;
    }


}
