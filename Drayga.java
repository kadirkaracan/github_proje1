import javax.xml.transform.Source;

public class Drayga extends Beyblade {
private String kutsalCanavar;

public Drayga(String beybladeci, int donusHizi, int saldiriGucu,String kutsalCanavar) {
	super(beybladeci, donusHizi, saldiriGucu);
	this.kutsalCanavar=kutsalCanavar;
}


public void kutsalCanavar() {
	System.out.println(getBeybladeci() + " " + this.kutsalCanavar + " � ortaya ��kar�yor...");
	System.out.println(getBeybladeci() + " �n  sald�r�s� : Kaplan Pen�esi..");
}
 public void bilgileriGoster() {
	 super.bilgileriGoster();
	 System.out.println("Kutsal Canavar :" + this. kutsalCanavar);
 }
public String getKutsalCanavar() {
	return kutsalCanavar;
}

public void setKutsalCanavar(String kutsalCanavar) {
	this.kutsalCanavar = kutsalCanavar;
}



}
