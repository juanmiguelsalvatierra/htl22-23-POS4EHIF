public class Wohnzimmerlampe extends Lampe{

    public Wohnzimmerlampe(String bez) {
        super(bez);
    }

    @Override
    public void getEmail(String code){
        //switch ()
        if (code == "l1" || code == "lw1" || code == "ls0"){
            setStatus(true);
            System.out.println("Wohnzimmerlampe " + getBez() + " eingeschaltet");

        } else if (code == "l0" || code == "lw0" || code == "h0"){
            setStatus(false);
            System.out.println("Wohnzimmerlampe " + getBez() + " ausgeschaltet");
        }

    }
}
