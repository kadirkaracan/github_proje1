
public class LabASistani extends Asistan{

	public LabASistani(String name, String telefon, String ePosta, String bolum, String unvan,String ofisSaati) {
		super(name, telefon, ePosta, bolum, unvan,ofisSaati);
		
	}
	
	public void lablaraGir(String saat) {
	
		System.out.println(this.getName() + " " + saat + " de lab dersine girecektir..." );
	}
public void derseGir(String saat) {
	System.out.println(this.getName() + " " + saat + " de derse girecektir" );
}

}
