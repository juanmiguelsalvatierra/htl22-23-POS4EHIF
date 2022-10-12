public class Zubehoer extends Fahrzeugteil{
    private String hersteller;

    public Zubehoer(String bezeichnung, String hersteller){
        super(bezeichnung);
        this.hersteller = hersteller;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " " + hersteller;
    }
}
