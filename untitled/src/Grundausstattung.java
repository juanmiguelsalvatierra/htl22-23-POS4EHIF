public class Grundausstattung extends Fahrzeugteil{
    private String hersteller;
    private int version;

    public Grundausstattung(String bezeichnung, int version){
        super(bezeichnung);
        this.version = version;
    }

    @Override
    public String getInfo() {
        return null;
    }
}
