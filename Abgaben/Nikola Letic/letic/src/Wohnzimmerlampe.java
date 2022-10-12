public class Wohnzimmerlampe extends Lampe{

    public Wohnzimmerlampe(String bez) {
        super(bez);
    }

    @Override
    public void Aufgabe(String email) {
        if(super.getStatus()){
            switch(email){
                case "L0":
                case "LW0":
                case "H0":
                    changeStatus();
                    break;
            }
        }else{
            switch(email){
                case "L1":
                case "LW1":
                case "LS0":
                    changeStatus();
                    break;
            }
        }
    }
    private void changeStatus(){

        super.setStatus(!super.getStatus());
        if(getStatus()){
            System.out.println(getBez() + " ist jetzt eingeschalten");
        }else{
            System.out.println(getBez() + " ist jetzt ausgeschalten");
        }
    }
}
