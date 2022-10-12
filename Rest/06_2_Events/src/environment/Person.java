package environment;


public class Person implements AccidentListener {

	
// Attribute
	private int koord_x, koord_y;
	

// Konstruktoren
	public Person (int x, int y) {
		this.koord_x=x;
		this.koord_y=y;
	}
	
	
// Interface-Methoden
	@Override
	public void earthquake(int posx, int posy) {
		if ((posx==koord_x) && (posy==koord_y)) {
			System.out.println("PERSON:Ein Erdbeben - direkt unter mir!!!!");
		} else {
			System.out.println("PERSON:Ups, ein Erdbeben - Entfernung:"+Math.sqrt(Math.pow((koord_x-posx), 2)+Math.pow((koord_y-posy), 2)));	
		}
	}

	@Override
	public void fire(int posx, int posy) {
		if ((posx==koord_x) && (posy==koord_y)) {
			System.out.println("PERSON:Es brennt direkt bei mir im Haus!!");
		} else {
			System.out.println("PERSON:Ups, es brennt - Entfernung:"+Math.sqrt(Math.pow((koord_x-posx), 2)+Math.pow((koord_y-posy), 2)));	
		}
	}
} // end class
