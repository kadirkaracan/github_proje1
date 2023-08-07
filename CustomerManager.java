import java.util.Scanner;

public class CustomerManager {
private BasePhoneManager phone;
private String depolamaAlaný;
private String renk;
private String RAM;
Scanner scanner=new Scanner(System.in);
double otv=0;
int price;
public CustomerManager(BasePhoneManager phone, String depolamaAlaný, String renk, String RAM) {
	
	this.phone = phone;
	this.depolamaAlaný = depolamaAlaný;
	this.renk = renk;
	this.RAM = RAM;
	
}


public void otvTutarý() {
	System.out.println("Almak istediðiniz telefonun geliþ ücreti(maliyeti) ne kadardýr ...");
	int price=scanner.nextInt();
	this.price=price;
	
	if (price>=3000) {
		otv=0.4;
	}
	else if (price<3000 && price>=1500) {
		otv=0.25;
	}
	else if (price <1500 && price>= 0) {
		otv=0.1;
	}
	else {
		otv=0;
	}
	System.out.println("Ödemekle yükümlü olduðunuz ötv tutarý: " + otv);
}
public void phoneÝnfos() {
	System.out.println("Almak istediðiniz telefonun bilgileri aþaðýdaki gibidir.");
	System.out.println("Telefonun Markasý: " + phone.getPhone_Brand());
	System.out.println("Telefonun modeli: " + phone.getPhone_Model());
	System.out.println("Telefonun rengi: " + this.renk);
	System.out.println("Telefonun depolama alaný: " + this.depolamaAlaný);
	System.out.println("Telefonun RAM belleði: " + this.RAM);
	System.out.println("Telefonun ham fiyatý: " +price);
	System.out.println("Telefona uygulanan ötv zammý: " + otv);
	System.out.println("Telefonun toplam fiyatý: " + phone.buy_Phone(price, otv));
}


public BasePhoneManager getPhone() {
	return phone;
}
public void setPhone(BasePhoneManager phone) {
	this.phone = phone;
}
public String getDepolamaAlaný() {
	return depolamaAlaný;
}
public void setDepolamaAlaný(String depolamaAlaný) {
	this.depolamaAlaný = depolamaAlaný;
}
public String getRenk() {
	return renk;
}
public void setRenk(String renk) {
	this.renk = renk;
}
public String getRAM() {
	return RAM;
}
public void setRAM(String rAM) {
	RAM = rAM;
}
public Scanner getScanner() {
	return scanner;
}
public void setScanner(Scanner scanner) {
	this.scanner = scanner;
}


}
