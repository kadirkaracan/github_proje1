
public class TEST {

	public static void main(String[] args) {
		Boksorler boksor1=new Boksorler("Kadir", 69.5, 176, 75, 32);
		Boksorler boksor2=new Boksorler("Samet", 63.0, 179.0, 50, 25);
boksor1.printBoksor();
boksor2.printBoksor();

Ring ring=new Ring(boksor1, boksor2, 60, 75, 20, 35);
ring.Karsilastir();
ring.ringSartlari();

KazananBoksor kazananBoksor=new KazananBoksor();
kazananBoksor.kazanan(boksor1, boksor2);
	}

}
