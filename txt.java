import java.util.Scanner;

public class txt {

	public static void main(String[] args) {
		System.out.println( "Beyblade Sistemine hoþgeldiniz");
		System.out.println( "------------------------------------");
		Scanner scanner=new Scanner(System.in);
		System.out.println( "Çýkýþ iþlemi için Q ya basýnýz ");
		String islem=scanner.nextLine();
if (islem.equals("q")) {
	System.out.println("Programdan çýkýlýyor...");
	
}

else {
	BeybladeFabrikasi fabrika=new BeybladeFabrikasi();
	Beyblade b1=fabrika.beybladeUret(islem);
	if (b1==null) {
		System.out.println("Lütfen geçerli bir beyblade ismi giriniz...");
	}
	else
		b1.bilgileriGoster();
	b1.kutsalCanavar();
	b1.saldir();
}
	}

}
