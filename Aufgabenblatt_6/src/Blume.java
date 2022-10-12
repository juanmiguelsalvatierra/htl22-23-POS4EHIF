public class Blume extends Pflanze{
    private String farbe;
    protected Blume(String bezeichnung, String farbe, int wohlfuehltemperatur, int wasserstand, int wasserstandMax, int wasserstandMin) {
        super(bezeichnung, wohlfuehltemperatur, wasserstand, wasserstandMax, wasserstandMin);
        this.farbe = farbe;
    }
}
