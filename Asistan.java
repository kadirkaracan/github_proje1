

public class Asistan extends Akademisyen {
 private String ofisSaati;

public Asistan(String name, String telefon, String ePosta, String bolum, String unvan, String ofisSaati) {
	super(name, telefon, ePosta, bolum, unvan);
	this.ofisSaati=ofisSaati;
}
 public void quizYap() {
	 System.out.println(this.getName()+ " " + this.ofisSaati + " de quiz yapacaktýr..." );
 }
 
}
