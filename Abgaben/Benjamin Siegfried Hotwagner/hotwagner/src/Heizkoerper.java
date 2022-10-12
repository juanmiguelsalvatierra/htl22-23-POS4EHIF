public class Heizkoerper implements IAktion{
    String bez;
    boolean status;//true=an, false=off

    public Heizkoerper(String bez, boolean status) {
        this.bez = bez;
        this.status = status;
    }

    @Override
    public void onStatusAendern(String code) {
        if (code.equals("H1")){
            if (this.status!=true){
                this.status=true;
                System.out.println("Heizkoerper "+bez+ " status changed to "+status);
            }
        }
        else if (code.equals("H0")){
            if (this.status!=false){
                this.status=false;
                System.out.println("Heizkoerper "+bez+ " status changed to "+status);
            }
        }
    }
}
