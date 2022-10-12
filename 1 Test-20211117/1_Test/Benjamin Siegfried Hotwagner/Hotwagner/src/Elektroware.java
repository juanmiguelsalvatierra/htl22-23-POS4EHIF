public class Elektroware extends Produkt{
    double watt;

    public double getWatt() {
        return watt;
    }

    public void setWatt(double watt) {
        this.watt = watt;
    }

    public Elektroware(double preis, double gewicht, double watt) {
        super(preis, gewicht);
        this.watt = watt;
    }

    @Override
    public String toString() {
        return "Elektroware{" +
                "watt=" + watt +
                ", preis=" + preis +
                ", gewicht=" + gewicht +
                '}';
    }
}
