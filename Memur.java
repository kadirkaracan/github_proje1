
public class Memur extends Calisan {
private String departman;
private String mesai;

public Memur(String name,String telefon,String ePosta,String departman,String mesai) {
	super(name, telefon, ePosta);
	this.departman=departman;
	this.mesai=mesai;
}

public void calis(String saat) {
	System.out.println(this.getName() + " " + saat + " de çalýþmaya baþladý..." );
}



public String getDepartman() {
	return departman;
}

public void setDepartman(String departman) {
	this.departman = departman;
}

public String getMesai() {
	return mesai;
}

public void setMesai(String mesai) {
	this.mesai = mesai;
}


}
