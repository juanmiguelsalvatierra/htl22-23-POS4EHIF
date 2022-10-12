public class Polizist extends Mensch{
    final String dienstgrad;
    protected Polizist(String vorname, String nachname, String dienstgrad) {
        super(vorname, nachname);
        this.dienstgrad = dienstgrad;
    }

    @Override
    public void wechsleKleidung() {

    }
}
