
public class Draciel extends Beyblade {
private String kutsalCanavar;

public Draciel(String Beybladeci,int saldiriGucu,int donusHizi,String kutsalcanavar) {
	super(Beybladeci, donusHizi, saldiriGucu);
	this.kutsalCanavar=kutsalCanavar;
	
}


public void kutsalCanavar() {
	System.out.println(getBeybladeci() + " " + this.kutsalCanavar + " ý ortaya çýkarýyor....");
	System.out.println(getBeybladeci() + " ýn savunmasý : Kale savunmasý");
	
}
public void bilgileriGoster() {
	super.bilgileriGoster();
	System.out.println( "Kutsal canavarý: " + this.kutsalCanavar);
}

public String getKutsalCanavar() {
	return kutsalCanavar;
}

public void setKutsalCanavar(String kutsalCanavar) {
	this.kutsalCanavar = kutsalCanavar;
}



}
