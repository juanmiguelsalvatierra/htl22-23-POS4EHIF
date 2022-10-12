public class Haushaltsartikel extends Ware{
    public boolean isBio;

    public Haushaltsartikel(String art, float preis, float gewicht, boolean isBio) {
        super(art, preis, gewicht);
        this.isBio = isBio;
    }
}
