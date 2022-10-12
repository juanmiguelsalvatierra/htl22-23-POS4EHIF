public class Heizkörper implements IEMail{

    private String bez;
    private boolean status;
    private IEMail next;

    public Heizkörper(String bez){
        this.bez = bez;
    }

    public void getEmail(String code) {
        //switch ()
        if (code == "h1") {
            setStatus(true);
        } else if (code == "h0") {
            setStatus(false);
        }
    }

    public String getBez() {
        return bez;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public IEMail getNext(){
        return next;
    }

    public void setNext(IEMail next){
        this.next = next;
    }
}
