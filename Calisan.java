
public class Calisan {
private String name;
private String telefon;
private String ePosta;
public Calisan(String name, String telefon, String ePosta) {
	
	this.name = name;
	this.telefon = telefon;
	this.ePosta = ePosta;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTelefon() {
	return telefon;
}
public void setTelefon(String telefon) {
	this.telefon = telefon;
}
public String getePosta() {
	return ePosta;
}
public void setePosta(String ePosta) {
	this.ePosta = ePosta;
}

public void giris( String saat) {
	System.out.println(this.name + " " + saat + " de giriþ yaptý..." );
}
public void cikis(String saat) {
	System.out.println(this.name + " " + saat + " de çýkýþ yaptý..." );
}
public void yemekhane(String saat) {
	System.out.println(this.name + " " + saat + " de yemekhaneye giriþ yaptý..." );
}
}
