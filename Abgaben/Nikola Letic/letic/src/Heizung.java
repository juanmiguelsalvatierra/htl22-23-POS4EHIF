public class Heizung implements IEmailaufgabe{
    private String bez; //heizung wurde nicht gesgat was für attwibute sie hat, also nehme ich dieselben wie bei der lampe
    private Boolean status=false;

    public Heizung(String bez) {
        this.bez = bez;
    }

    public void Aufgabe(String email) {
        if(status){
            switch(email){
                case "H0":
                    changeStatus();
                    break;
            }
        }else{
            switch(email){
                case "H1":
                    changeStatus();
                    break;
            }
        }
    }
    private void changeStatus(){

        status=!status;
        if(status){
            System.out.println(bez + " ist jetzt eingeschalten");
        }else{
            System.out.println(bez + " ist jetzt ausgeschalten");
        }
    }
}
