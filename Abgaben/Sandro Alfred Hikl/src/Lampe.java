public abstract class Lampe implements IControl{
    private String bez;
    protected boolean onoff = false;
    private IControl next = null;
    public Lampe(String bez) {
        this.bez = bez;
    }


    @Override
    public abstract void Aktion(String code);

    public String getBez() {
        return bez;
    }

    public boolean getOnoff() {
        return onoff;
    }

    public void setOnoff(boolean x) {
        onoff = x;
    }


}
