
public class OgretimGorevlisi extends Akademisyen{
private String kapiNo;

public OgretimGorevlisi(String name, String telefon, String ePosta, String bolum, String unvan) {
	super(name, telefon, ePosta, bolum, unvan);
	this.kapiNo=kapiNo;
}

public void senatoToplanti(String saat) {
	System.out.println(this.getName() + " " + saat + " de toplant� yapacakt�r..." );
}
public void sinavYap(String saat) {
	System.out.println(this.getName() + " " + saat + " de s�nav yapacakt�r..." );
}


public String getKapiNo() {
	return kapiNo;
}

public void setKapiNo(String kapiNo) {
	this.kapiNo = kapiNo;
}


}
