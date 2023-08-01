import java.security.PublicKey;
import java.util.Scanner;

public class TravelType {
private String sehir1;
private String sehir2;

private  int yolcuYas;
private int seferSayisi;
private double cost;
private double mesafe;

public TravelType(String sehir1,String sehir2,int yolcuYas,int seferSayisi,double cost,double mesafe) {
	this.sehir1=sehir1;
	this.sehir2=sehir2;
	
	this.yolcuYas=yolcuYas;
	this.seferSayisi=seferSayisi;
	this.cost=cost; // km baþýna ücreti temsil ediyor.
    if (mesafe<0) {
		System.out.println("Hatalý veri girdiniz");
	}
    else {
		this.mesafe=mesafe;
	}
	
}


public double mesafeParasi() {
if(this.seferSayisi==1) {
	return (this.mesafe*this.cost)*1;
}
else if(this.seferSayisi==2) {
	return (this.mesafe*this.cost)*2;
}
else {
	return 0;
}
}

public double indirimler() {
	if (this.yolcuYas<12 && this.yolcuYas>0) {
	return mesafeParasi()*0.5;	
	}
	else if (this.yolcuYas<24) {
		return mesafeParasi()*0.1;
	}
	else if(this.yolcuYas>65) {
		return mesafeParasi()*0.3;
	}
	
	else {
		return 0;
	}
	
}
	public  double indirimler2() {
		if (this.seferSayisi==2) {
			return mesafeParasi()*0.2;
		}
		else {
			return 0;
		}
	}

	public double toplamTutar() {
		if (mesafeParasi()-indirimler()-indirimler2()>0) {
			return mesafeParasi()-indirimler()-indirimler2();
		}
		else {
			return 0;
		}
	
	}
	public void Git() {
		System.out.println("Yolcu " + this.sehir1 + "-" + this.sehir2 + " arasýný " + toplamTutar() + " TL ile gidiyor");
	}
public String getSehir1() {
	return sehir1;
}

public void setSehir1(String sehir1) {
	this.sehir1 = sehir1;
}

public String getSehir2() {
	return sehir2;
}

public void setSehir2(String sehir2) {
	this.sehir2 = sehir2;
}



public int getYolcuYas() {
	return yolcuYas;
}

public void setYolcuYas(int yolcuYas) {
	this.yolcuYas = yolcuYas;
}

public double getCost() {
	return cost;
}

public void setCost(double cost) {
	this.cost = cost;
}

public double getMesafe() {
	return mesafe;
}

public void setMesafe(double mesafe) {
	this.mesafe = mesafe;
}

public int getSeferSayisi() {
	return seferSayisi;
}

public void setSeferSayisi(int seferSayisi) {
	this.seferSayisi = seferSayisi;
}

}
