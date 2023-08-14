import java.util.Scanner;

public class Yolcu {
  private String name;
  private boolean vize;
  private boolean referans;
  private int harcUcreti;
  private boolean yabanciDil;
  private boolean siyasiYasak;
public Yolcu( ) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("L�tfen yolcunun ismini giriniz...");
	this.name=scanner.nextLine(); 
	System.out.println("Yolcunun vizesi var m�??");
	this.vize=scanner.nextBoolean();
	if (this.vize==true) {
		System.out.println(this.name + " adl� Yolcunun vizesi vard�r.");
		this.vize=true;
	}
	else {
		System.out.println(this.name + " adl� yolcunun vizesi bulunmuyor.");
		this.vize=false;
		
	}
	
	System.out.println("Yolcunun har� �creti ne kadard�r? : " );
this.harcUcreti=scanner.nextInt();
	if (this.harcUcreti >=1500) {
		System.out.println(this.name + " nin yeterli miktarda har� paras� vard�r." + this.harcUcreti);
		
	}
	
	
	System.out.println(this.name + " adl� Yolcunun yabanc� dili bulunuyor mu?");
	this.yabanciDil=scanner.nextBoolean();
	if (this.yabanciDil==true) {
		System.out.println(this.name + " adl� Yolcunun yabanc� dili vard�r : �ngilizce");
		this.yabanciDil=true;
	}
	else {
		System.out.println(this.name + " adl� Yolcunun yabanc� dili bulunmuyor");
		this.yabanciDil=false;
	}
	System.out.println("Yolcunun siyasi yasa�� bulunuyor mu?");
	this.siyasiYasak=scanner.nextBoolean();
	if (siyasiYasak==false) {
		System.out.println(this.name + " adl� Yolcunun siyasi yasa�� bulunmuyor...");
		this.siyasiYasak=false;
	}else {
		System.out.println(this.name + " adl� Yolcunun siyasi yasa�� bulunuyor");
		this.siyasiYasak=true;
	}
	System.out.println("Yolcu herhangi bir referansa sahip mi?");
	referans=scanner.nextBoolean();
	if (referans==true) {
		this.referans=true;
	}else {
		System.out.println("Yolcu herhangi bir referansa sahip de�il.");
		this.referans=false;
	}
	
}
public String getName() {
	return name;
}
public void setName() {
	this.name = name;
}
public boolean getVize() {
	return vize;
}
public void setVize() {
	this.vize = vize;
}
public boolean getReferans() {
	return referans;
}
public void setReferans() {
	this.referans = referans;
}
public int getHarcUcreti() {
	return harcUcreti;
}
public void setHarcUcreti() {
	this.harcUcreti = harcUcreti;
}
public boolean getYabanciDil() {
	return yabanciDil;
}
public void setYabanciDil() {
	this.yabanciDil = yabanciDil;
}
public boolean getSiyasiYasak() {
	return siyasiYasak;
}
public void setSiyasiYasak() {
	this.siyasiYasak = siyasiYasak;
}
  
  

  
  

}
