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
	System.out.println("Lütfen yolcunun ismini giriniz...");
	this.name=scanner.nextLine(); 
	System.out.println("Yolcunun vizesi var mý??");
	this.vize=scanner.nextBoolean();
	if (this.vize==true) {
		System.out.println(this.name + " adlý Yolcunun vizesi vardýr.");
		this.vize=true;
	}
	else {
		System.out.println(this.name + " adlý yolcunun vizesi bulunmuyor.");
		this.vize=false;
		
	}
	
	System.out.println("Yolcunun harç ücreti ne kadardýr? : " );
this.harcUcreti=scanner.nextInt();
	if (this.harcUcreti >=1500) {
		System.out.println(this.name + " nin yeterli miktarda harç parasý vardýr." + this.harcUcreti);
		
	}
	
	
	System.out.println(this.name + " adlý Yolcunun yabancý dili bulunuyor mu?");
	this.yabanciDil=scanner.nextBoolean();
	if (this.yabanciDil==true) {
		System.out.println(this.name + " adlý Yolcunun yabancý dili vardýr : Ýngilizce");
		this.yabanciDil=true;
	}
	else {
		System.out.println(this.name + " adlý Yolcunun yabancý dili bulunmuyor");
		this.yabanciDil=false;
	}
	System.out.println("Yolcunun siyasi yasaðý bulunuyor mu?");
	this.siyasiYasak=scanner.nextBoolean();
	if (siyasiYasak==false) {
		System.out.println(this.name + " adlý Yolcunun siyasi yasaðý bulunmuyor...");
		this.siyasiYasak=false;
	}else {
		System.out.println(this.name + " adlý Yolcunun siyasi yasaðý bulunuyor");
		this.siyasiYasak=true;
	}
	System.out.println("Yolcu herhangi bir referansa sahip mi?");
	referans=scanner.nextBoolean();
	if (referans==true) {
		this.referans=true;
	}else {
		System.out.println("Yolcu herhangi bir referansa sahip deðil.");
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
