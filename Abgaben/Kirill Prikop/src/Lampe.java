public class Lampe extends Haus{

    private boolean status;

    public Lampe(boolean status) {
        this.status=status;
    }

    public void SetStatus(boolean änderung){
        status=änderung;
    }
}
