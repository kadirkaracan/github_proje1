
public class GuvenlikGorevlisi extends Memur {

	private String belge;

	public GuvenlikGorevlisi(String name, String telefon, String ePosta, String departman, String mesai) {
		super(name, telefon, ePosta, departman, mesai);
	this.belge=belge;
	}
public void nobet () {
	System.out.println(this.getName() + " Bugün nöbet tutacaktýr.");
}
	public String getBelge() {
		return belge;
	}

	public void setBelge(String belge) {
		this.belge = belge;
	}
	
	
}
