


public class InterfaceTest {

	public static void main(String[] args) {
		Mutateable[] mutateables = new Mutateable[2];
		mutateables[0]=new Person();                    // wie von Polymorphie schon bekannt --> dynamische Bindung
		mutateables[1]=new Gebaeude();                  // wie von Polymorphie schon bekannt --> dynamische Bindung
		for (int i=0;i<2;i++)  { mutateables[i].levelUp();}
		if (mutateables[0] instanceof Person) {Person p=(Person) mutateables[0];} // Typkonvertierung möglich!

		
	}
	
}
