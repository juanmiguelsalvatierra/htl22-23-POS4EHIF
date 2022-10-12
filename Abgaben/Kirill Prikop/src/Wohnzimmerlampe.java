public class Wohnzimmerlampe extends Lampe implements IEmail{

    public Wohnzimmerlampe(boolean status){
        super(status);
    }

    @Override
    public String getEmail(String code) {
        if (code=="L1"||code=="LW1"||code=="LS0"){
            SetStatus(true);
            return "Wohnzimmerlampe ist jetzt an";
        }else{
            if(code=="L0"||code=="LW0"||code=="H0"){
                SetStatus(false);
                return "Wohnzimmerlampe ist jetzt aus";
            }
        }

        return null;
    }
}
