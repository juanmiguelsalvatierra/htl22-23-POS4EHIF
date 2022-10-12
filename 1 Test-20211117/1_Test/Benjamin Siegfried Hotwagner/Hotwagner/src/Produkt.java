public abstract class Produkt {
    double preis;

    @Override
    public String toString() {
        return "Produkt{" +
                "preis=" + preis +
                ", gewicht=" + gewicht +
                ", spezifikum='" + spezifikum + '\'' +
                //", next=" + next +
                '}';
    }

    double gewicht;
    String spezifikum;
    Produkt next;//for ProduktList

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public String getSpezifikum() {
        return spezifikum;
    }

    public void setSpezifikum(String spezifikum) {
        this.spezifikum = spezifikum;
    }

    public Produkt getNext() {
        return next;
    }

    public void setNext(Produkt next) {
        this.next = next;
    }

    public Produkt(double preis, double gewicht) {
        this.preis = preis;
        this.gewicht = gewicht;
    }
}
