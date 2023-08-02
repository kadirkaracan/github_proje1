
public class Meyve {
private String igne;
private String name;
public Meyve(String igne,String name) {
	this.igne=igne;
	this.name=name;
}

public void igneVur() {
	System.out.println(this.name + " adlý meyveye"+ this.igne+  " iðnesi vuruldu");
}


public String getIgne() {
	return igne;
}

public void setIgne(String igne) {
	this.igne = igne;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


}
