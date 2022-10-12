abstract class Lampe implements IAktion{
    String bez;
    boolean status;//true=an, false=off

    public Lampe(String bez, boolean status) {
        this.bez = bez;
        this.status = status;
    }
    public abstract void onStatusAendern(String code);
}
