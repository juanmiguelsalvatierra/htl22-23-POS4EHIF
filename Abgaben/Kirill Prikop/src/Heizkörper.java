public class Heizkörper extends Haus implements IEmail{
    private boolean status;

    public Heizkörper(boolean status){
        this.status=status;
    }


    @Override
    public String getEmail(String code) {
        if (code=="H1"){
            status=true;
            return "Heizkörper ist jetzt an";
        }else{
            if(code=="H0"){
                status=false;
                return "Heizkörper ist jetzt aus";
            }
        }
        return null;
    }
}
