
public class Ring {
private Boksorler boksor1;
private Boksorler boksor2;
private double minweight;
private double maxweight;
private int minyas;
private int maxyas;


public Ring(Boksorler boksor1,Boksorler boksor2, double minweight,double maxweight,int minyas,int maxyas) {
	this.boksor1=boksor1;
	this.boksor2=boksor2;
	this.minweight=minweight;
	this.maxweight=maxweight;
	this.minyas=minyas;
	this.maxyas=maxyas;
	
}
public void ringSartlari() {
	if(this.boksor1.getWeight()<=this.maxweight && this.boksor1.getWeight()>=this.minweight && this.boksor1.getYas()>=this.minyas && this.boksor1.getYas()<=this.maxyas ) {
		System.out.println(this.boksor1.getName()+ " adlý boksör ringe çýkmaya hak kazanmýþtýr.");
	}
	else {
		System.out.println(this.boksor1.getName()+ " adlý boksör ringe çýkmaya hak kazanamamýþtýr.");
	}
	if (this.boksor2.getWeight()<=this.maxweight && this.boksor2.getWeight()>=this.minweight && this.boksor2.getYas()>=this.minyas && this.boksor2.getYas()<=this.maxyas) {
		System.out.println(this.boksor2.getName()+ " adlý boksör ringe çýkmaya hak kazanmýþtýr.");
	}
	else {
		System.out.println(this.boksor2.getName()+ " adlý boksör ringe çýkmaya hak kazanamamýþtýr.");
	}
}
public void Karsilastir() {
	if (this.boksor1.getWeight()>this.boksor2.getWeight()) {
		this.boksor1.puan+=1;
		
	}
	else {
		this.boksor2.puan+=1;
	}
	if (this.boksor1.getHasar()>this.boksor2.getHasar()) {
		this.boksor1.puan+=1;
	}
	else {
		this.boksor2.puan+=1;
	}
	if (this.boksor1.getHeight()>this.boksor2.getHeight()) {
		this.boksor1.puan+=1;
	}
	else {
		this.boksor2.puan+=1;
	}
}

public Boksorler getBoksor1() {
	return boksor1;
}


public void setBoksor1(Boksorler boksor1) {
	this.boksor1 = boksor1;
}


public Boksorler getBoksor2() {
	return boksor2;
}


public void setBoksor2(Boksorler boksor2) {
	this.boksor2 = boksor2;
}


public double getMinweight() {
	return minweight;
}


public void setMinweight(double minweight) {
	this.minweight = minweight;
}


public double getMaxweight() {
	return maxweight;
}


public void setMaxweight(double maxweight) {
	this.maxweight = maxweight;
}


public int getMinyas() {
	return minyas;
}


public void setMinyas(int minyas) {
	this.minyas = minyas;
}


public int getMaxyas() {
	return maxyas;
}


public void setMaxyas(int maxyas) {
	this.maxyas = maxyas;
}

}
