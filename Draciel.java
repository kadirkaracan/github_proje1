
public class Draciel extends Beyblade {
private String kutsalCanavar;

public Draciel(String Beybladeci,int saldiriGucu,int donusHizi,String kutsalcanavar) {
	super(Beybladeci, donusHizi, saldiriGucu);
	this.kutsalCanavar=kutsalCanavar;
	
}


public void kutsalCanavar() {
	System.out.println(getBeybladeci() + " " + this.kutsalCanavar + " � ortaya ��kar�yor....");
	System.out.println(getBeybladeci() + " �n savunmas� : Kale savunmas�");
	
}
public void bilgileriGoster() {
	super.bilgileriGoster();
	System.out.println( "Kutsal canavar�: " + this.kutsalCanavar);
}

public String getKutsalCanavar() {
	return kutsalCanavar;
}

public void setKutsalCanavar(String kutsalCanavar) {
	this.kutsalCanavar = kutsalCanavar;
}



}
