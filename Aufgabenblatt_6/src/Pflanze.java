public abstract class Pflanze implements Interface{
    final String bezeichnung;
    final int wohlfuehltemperatur;
    private int wasserstand;
    final int wasserstandMax;
    final int wasserstandMin;
    Pflanze next;

    protected Pflanze(String bezeichnung, int wohlfuehltemperatur, int wasserstand, int wasserstandMax, int wasserstandMin) {
        this.bezeichnung = bezeichnung;
        this.wohlfuehltemperatur = wohlfuehltemperatur;
        this.wasserstand = wasserstand;
        this.wasserstandMax = wasserstandMax;
        this.wasserstandMin = wasserstandMin;
    }

    public String getBezeichnung(){
        return bezeichnung;
    }

    public int getWohlfuehltemperatur(){
        return wohlfuehltemperatur;
    }

    public int getWasserstand(){
        return wasserstand;
    }

    public int getWasserstandMax(){
        return wasserstandMax;
    }

    public int getWassserstandMin(){
        return wasserstandMin;
    }

    public void setWasserstand(int wasserstand){
        this.wasserstand = wasserstand;
    }

    public Pflanze getNext(){
        return next;
    }

    public void setNext(Pflanze next){
        this.next = next;
    }

    public void verliereBlaetter(){
        System.out.println("");
    };

    public void eRegen(int regen){
        wasserstand += regen;
        if(wasserstand > wasserstandMax){
            verliereBlaetter();
        }
    }

    public void eTemperatur(int temp){
        if(temp > wohlfuehltemperatur){
            wasserstand--;
            verliereBlaetter();
        }

    }
}
