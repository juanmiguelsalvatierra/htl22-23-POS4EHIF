package environment;



public class House implements AccidentListener { 

	
// Attribute
	private int koord_x, koord_y;
	
	
// Konstruktoren	
	public House (int x, int y) {
		this.koord_x=x;
		this.koord_y=y;
	}
	

	public House (int x, int y, Environment e) {
		this.koord_x=x;
		this.koord_y=y;
		e.addListener(this);
	}


// Interface-Methoden	
	@Override
	public void earthquake(int posx, int posy) {
		if ((posx==koord_x) && (posy==koord_y)) {
			System.out.println("HAUS:Ein Erdbeben - direkt unter mir!!!!");
		} else {
			System.out.println("HAUS:Ups, ein Erdbeben - Entfernung:"+Math.sqrt(Math.pow((koord_x-posx), 2)+Math.pow((koord_y-posy), 2)));	
		}
	}

	@Override
	public void fire(int posx, int posy) {
		if ((posx==koord_x) && (posy==koord_y)) {
			System.out.println("HAUS:Es brennt direkt bei mir im Haus!!");
		} else {
			System.out.println("HAUS:Ups, es brennt - Entfernung:"+Math.sqrt(Math.pow((koord_x-posx), 2)+Math.pow((koord_y-posy), 2)));	
		}
	}


	   
} // end class
