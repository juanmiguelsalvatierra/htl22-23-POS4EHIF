public abstract class Lampe implements IEMail{
    private String bez;
    private boolean status;
    private IEMail next;


    public Lampe(String bez) {
        this.bez = bez;
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

    @Override
    public void getEmail(String code) {
    }

    public IEMail getNext(){
        return next;
    }

    public void setNext(IEMail next){
        this.next = next;
    }
}
