import java.util.Scanner;

public class Vectors {
private String isim;
private int i;
private int j;
private int k;
public Vectors() {
	Scanner scanner=new Scanner(System.in);
	System.out.print("Vekt�r�n ismini Giriniz:");
	this.isim = scanner.nextLine();
	System.out.print(this.isim + " Vekt�r�n�n i uzant�s�n� giriniz: ");
	this.i = scanner.nextInt();
	System.out.print(this.isim + " Vekt�r�n�n j uzant�s�n� giriniz: ");
	this.j = scanner.nextInt();
	System.out.print(this.isim + " Vekt�r�n�n k uzant�s�n� giriniz: ");
	this.k = scanner.nextInt();
}


public String getIsim() {
	return isim;
}
public void setIsim(String isim) {
	this.isim = isim;
}
public int getI() {
	return i;
}
public void setI(int i) {
	this.i = i;
}
public int getJ() {
	return j;
}
public void setJ(int j) {
	this.j = j;
}
public int getK() {
	return k;
}
public void setK(int k) {
	this.k = k;
}


}
