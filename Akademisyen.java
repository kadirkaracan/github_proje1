
public class Akademisyen extends Calisan{
private String bolum;
private String unvan;

public Akademisyen(String name,String telefon,String ePosta,String bolum,String unvan) {
	super(name, telefon, ePosta);
	this.bolum=bolum;
	this.unvan=unvan;
}





public String getBolum() {
	return bolum;
}

public void setBolum(String bolum) {
	this.bolum = bolum;
}

public String getUnvan() {
	return unvan;
}

public void setUnvan(String unvan) {
	this.unvan = unvan;
}

public void derseGir(String saat) {
	System.out.println(this.getName() + " " + saat + " de giriþ yaptý..." );
}
}
