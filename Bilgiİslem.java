
public class Bilgi�slem extends Memur {
private String gorev;





public Bilgi�slem(String name, String telefon, String ePosta, String departman, String mesai) {
	super(name, telefon, ePosta, departman, mesai);
	this.gorev=gorev;
}


public void networkKurulum() {
	System.out.println(this.getName()  + " in g�revi network kurulumudur..." );
}


public String getGorev() {
	return gorev;
}


public void setGorev(String gorev) {
	this.gorev = gorev;
}


}
