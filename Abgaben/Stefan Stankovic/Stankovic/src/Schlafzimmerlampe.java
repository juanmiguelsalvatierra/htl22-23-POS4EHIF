public class Schlafzimmerlampe extends Lampe{
    public Schlafzimmerlampe(String bez) {
        super(bez);
    }

    public void getEmail(String code) {
        //switch ()
        if (code == "l1" || code == "lw0" || code == "ls1") {
            setStatus(true);
            System.out.println("Schlafzimmerlampe " + getBez() + " eingeschaltet");

        } else if (code == "l0" || code == "ls0" || code == "h0") {
            setStatus(false);
            System.out.println("Schlafzimmerlampe " + getBez() + " ausgeschaltet");
        }
    }
}
