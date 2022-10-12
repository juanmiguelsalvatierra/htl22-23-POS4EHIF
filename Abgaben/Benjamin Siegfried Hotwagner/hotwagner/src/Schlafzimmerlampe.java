public class Schlafzimmerlampe extends Lampe{
    public Schlafzimmerlampe(String bez, boolean status) {
        super(bez, status);
    }

    @Override
    public void onStatusAendern(String code) {
        if (code.equals("L1")||code.equals("LS1")||code.equals("LW0")){
            if (this.status!=true){
                this.status=true;
                System.out.println("Lapme "+bez+ " status changed to "+status);
            }
        }
        else if (code.equals("L0")||code.equals("LS0")){
            if (this.status!=false){
                this.status=false;
                System.out.println("Lapme "+bez+ " status changed to "+status);
            }
        }
    }
}
