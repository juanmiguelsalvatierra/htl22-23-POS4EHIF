public class Haushaltsartikel extends Produkt{

    public Boolean bio;

    public Haushaltsartikel(double preis, double gewicht, Boolean bio) {
        super(preis, gewicht);
        this.bio = bio;
    }
}
