public class Kind {
    private String name;
    private Kind next;

    public Kind(String name){
        this.name = name;
    }

    public void setname(String name){
        this.name = name;
    }

    public String getname(){
        return name;
    }

    public void setnext(Kind next){
        this.next = next;
    }

    public Kind getnext(){
        return next;
    }

}
