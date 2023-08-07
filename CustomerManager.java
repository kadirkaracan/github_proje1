import java.util.Scanner;

public class CustomerManager {
private BasePhoneManager phone;
private String depolamaAlan�;
private String renk;
private String RAM;
Scanner scanner=new Scanner(System.in);
double otv=0;
int price;
public CustomerManager(BasePhoneManager phone, String depolamaAlan�, String renk, String RAM) {
	
	this.phone = phone;
	this.depolamaAlan� = depolamaAlan�;
	this.renk = renk;
	this.RAM = RAM;
	
}


public void otvTutar�() {
	System.out.println("Almak istedi�iniz telefonun geli� �creti(maliyeti) ne kadard�r ...");
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
	System.out.println("�demekle y�k�ml� oldu�unuz �tv tutar�: " + otv);
}
public void phone�nfos() {
	System.out.println("Almak istedi�iniz telefonun bilgileri a�a��daki gibidir.");
	System.out.println("Telefonun Markas�: " + phone.getPhone_Brand());
	System.out.println("Telefonun modeli: " + phone.getPhone_Model());
	System.out.println("Telefonun rengi: " + this.renk);
	System.out.println("Telefonun depolama alan�: " + this.depolamaAlan�);
	System.out.println("Telefonun RAM belle�i: " + this.RAM);
	System.out.println("Telefonun ham fiyat�: " +price);
	System.out.println("Telefona uygulanan �tv zamm�: " + otv);
	System.out.println("Telefonun toplam fiyat�: " + phone.buy_Phone(price, otv));
}


public BasePhoneManager getPhone() {
	return phone;
}
public void setPhone(BasePhoneManager phone) {
	this.phone = phone;
}
public String getDepolamaAlan�() {
	return depolamaAlan�;
}
public void setDepolamaAlan�(String depolamaAlan�) {
	this.depolamaAlan� = depolamaAlan�;
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
