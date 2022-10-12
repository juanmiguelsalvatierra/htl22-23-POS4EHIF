public class Schlafzimmerlampe extends Lampe implements IEmail{

    public Schlafzimmerlampe(boolean status){
        super(status);
    }

    @Override
    public String getEmail(String code) {
        if (code=="L1"||code=="LW0"||code=="LS1"){
            SetStatus(true);
            return "Schlafzimmer ist jetzt an";
        }else{
            if(code=="L0"||code=="LS0"||code=="H0"){
                SetStatus(false);
                return "Schlafzimmerlampe ist jetzt aus";
            }
        }
        return null;
    }
}
