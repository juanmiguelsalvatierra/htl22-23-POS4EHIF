public class Haushaltsartikel extends Produkt{
    boolean bio;

    public boolean getBio() {
        return bio;
    }

    public void setBio(double watt) {
        this.bio = bio;
    }

    public Haushaltsartikel(double preis, double gewicht, boolean bio) {
        super(preis, gewicht);
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "Haushaltsartikel{" +
                "bio=" + bio +
                ", preis=" + preis +
                ", gewicht=" + gewicht +
                '}';
    }
}
