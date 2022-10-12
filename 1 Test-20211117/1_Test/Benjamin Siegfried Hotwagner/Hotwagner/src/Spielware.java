public class Spielware extends Produkt{
    String hersteller;

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(double watt) {
        this.hersteller = hersteller;
    }

    public Spielware(double preis, double gewicht, String hersteller) {
        super(preis, gewicht);
        this.hersteller = hersteller;
    }

    @Override
    public String toString() {
        return "Spielware{" +
                "preis=" + preis +
                ", gewicht=" + gewicht +
                ", hersteller='" + hersteller + '\'' +
                '}';
    }
}
