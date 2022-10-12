public abstract class Mensch implements Interface {
    final String vorname;
    final String nachname;
    Mensch next;

    protected Mensch(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public Mensch getNext(){
        return next;
    }

    public void setNext(Mensch next){
        this.next = next;
    }

    public void wechsleKleidung(){
        System.out.println("Vorname: " + vorname + " Nachname: " + nachname + " wechselt Kleidung");
    };

    public void eRegen(int regen){
        wechsleKleidung();
    }

    public void eTemperatur(int temp){
        wechsleKleidung();
    }
}
