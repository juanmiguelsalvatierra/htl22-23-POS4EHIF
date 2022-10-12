public abstract class Lampe implements IEmailaufgabe{

    private  String bez;
    private Boolean status=false;

    public Lampe(String bez) {
        this.bez = bez;
    }

    public String getBez() {
        return bez;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
