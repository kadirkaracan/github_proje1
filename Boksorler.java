
public class Boksorler {
private String name;
private double weight;
private double height;
private int hasar;
private int yas;
 int puan;

public Boksorler(String name,double weight, double height, int hasar,int yas) {
	this.name=name;
	this.weight=weight;
	this.height=height;
	this.hasar=hasar;
	this.yas=yas;
	this.puan=0; 
}


public void printBoksor() {
	System.out.println("boks�r�n ad�: "+ this.name);
	System.out.println("boks�r�n kilosu: "+ this.weight);
	System.out.println("boks�r�n boyu: "+ this.height);
	System.out.println("boks�r�n verdi�i hasar: "+ this.hasar);
	System.out.println("boks�r�n ya��: "+ this.yas);
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getWeight() {
	return weight;
}

public void setWeight(double weight) {
	this.weight = weight;
}

public double getHeight() {
	return height;
}

public void setHeight(double height) {
	this.height = height;
}

public int getHasar() {
	return hasar;
}

public void setHasar(int hasar) {
	this.hasar = hasar;
}

public int getYas() {
	return yas;
}

public void setYas(int yas) {
	this.yas = yas;
}


public int getPuan() {
	return puan;
}


public void setPuan(int puan) {
	this.puan = puan;
}



}
