import java.text.AttributedString;

public class Dragon  extends Beyblade{
private String kutsalCanavar;
private String gizliYetenek;
public Dragon(String beybladeci, int donusHizi, int saldiriGucu,String kutsalCanavar,String gizliYetenek) {
	super(beybladeci, donusHizi, saldiriGucu);
	this.kutsalCanavar=kutsalCanavar;
	this.gizliYetenek=gizliYetenek;
	
}
public void kutsalCanavar() {
	System.out.println(getBeybladeci() + " " + this.kutsalCanavar + " ý ortaya çýkarýyor...");
	System.out.println(getBeybladeci() + " ýn saldýrýsý : Hayalet Kasýrgasý");
	
}
public void bilgileriGoster() {
	super.bilgileriGoster();
	System.out.println("Kutsal canavarý: " + this.kutsalCanavar);
	System.out.println("Gizli Yetenek:" + this.gizliYetenek);
	
	
}



public String getKutsalCanavar() {
	return kutsalCanavar;
}
public void setKutsalCanavar(String kutsalCanavar) {
	this.kutsalCanavar = kutsalCanavar;
}
public String getGizliYetenek() {
	return gizliYetenek;
}
public void setGizliYetenek(String gizliYetenek) {
	this.gizliYetenek = gizliYetenek;
}



}
