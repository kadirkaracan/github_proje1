import java.util.Scanner;

public class txt {

	public static void main(String[] args) {
		System.out.println( "Beyblade Sistemine ho�geldiniz");
		System.out.println( "------------------------------------");
		Scanner scanner=new Scanner(System.in);
		System.out.println( "��k�� i�lemi i�in Q ya bas�n�z ");
		String islem=scanner.nextLine();
if (islem.equals("q")) {
	System.out.println("Programdan ��k�l�yor...");
	
}

else {
	BeybladeFabrikasi fabrika=new BeybladeFabrikasi();
	Beyblade b1=fabrika.beybladeUret(islem);
	if (b1==null) {
		System.out.println("L�tfen ge�erli bir beyblade ismi giriniz...");
	}
	else
		b1.bilgileriGoster();
	b1.kutsalCanavar();
	b1.saldir();
}
	}

}
