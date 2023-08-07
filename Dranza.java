
public class Dranza extends Beyblade {
 private String kutsalCanavar;

public Dranza(String beybladeci, int donusHizi, int saldiriGucu,String kutsalCanavar) {
	super(beybladeci, donusHizi, saldiriGucu);
	this.kutsalCanavar=kutsalCanavar;
}


public void kutsalCanavar() {
	System.out.println(getBeybladeci() +" " +this.kutsalCanavar + " ý ortaya çýkarýyor...");
	System.out.println(getBeybladeci() + " ýn saldýrýsý : Alev Saldýrýsý");
}
public void bilgileriGoster() {
	super.bilgileriGoster();
	System.out.println("Kutsal Canavar: " + this.kutsalCanavar);
}
public String getKutsalCanavar() {
	return kutsalCanavar;
}

public void setKutsalCanavar(String kutsalCanavar) {
	this.kutsalCanavar = kutsalCanavar;
}
 
 
}
