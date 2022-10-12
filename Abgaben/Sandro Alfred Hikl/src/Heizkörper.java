public class Heizkörper implements IControl{
    private String bez;
    private boolean onoff = false;
    private IControl next = null;
    public Heizkörper(String bez) {
        this.bez = bez;
    }

    @Override
    public void Aktion(String code) {
        if(code == "H1" && onoff != true) {
            System.out.println("Heizkörper: " + bez + " wird eingeschalten");
            onoff = true;
        }
        else if(code == "H0" && onoff != false) {
            System.out.println("Heizkörper: " + bez + " wird ausgeschalten");
            onoff = false;
        }
    }


}
