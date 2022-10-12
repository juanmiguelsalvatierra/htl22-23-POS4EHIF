public class ProduktList {
    Produkt root;
    double max;
    double gewicht;
    double gesamtpreis = 0;
    int length = 0;

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getGesamtpreis() {
        return gesamtpreis;
    }

    public void setGesamtpreis(double gesamtpreis) {
        this.gesamtpreis = gesamtpreis;
    }

    public void add(Produkt p){
        this.gewicht+=p.gewicht;
        length++;
        this.gesamtpreis+=p.preis;
        if (root == null){
            root = p;
            return;
        }
        Produkt tmp = root;
        while (tmp.next!=null){
            tmp = tmp.next;
        }
        tmp.next = p;
    }

    public void print(){
        Produkt tmp = root;
        while (tmp!=null){
            System.out.println(tmp.toString()+"\n");
            tmp = tmp.next;
        }
    }
}
