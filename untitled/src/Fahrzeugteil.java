public abstract class Fahrzeugteil {
    public String bezeichnung;
    public Fahrzeugteil next;

    public Fahrzeugteil(String bezeichnung){
        this.bezeichnung = bezeichnung;
    }

    public String getInfo(){
        return bezeichnung;
    }
}
