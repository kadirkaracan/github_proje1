import java.util.Scanner;
import java.util.function.IntBinaryOperator;

public class text {

	public static void main(String[] args) {
		// Bir yolcunun iki �ehir aras�nda hangi yolculuk tipiyle
		//gitti�inde (otob�s,u�ak,tren) ne kadar para �deyece�i proglamlanm��t�r.

		Scanner scanner = new Scanner(System.in);
		System.out.println("Mesafeyi km t�r�nden giriniz: ");
		double mesafe = scanner.nextDouble();
		System.out.println("L�tfen ya��n�z� giriniz: ");
		int yas = scanner.nextInt();
		System.out.println("Sefer say�s�n� giriniz: ");
		int sefer = scanner.nextInt();

		Otobus otobus1 = new Otobus("Ankara", "�stanbul", yas, sefer, 0.10, mesafe);
		System.out.println("Mesafe �creti:" + otobus1.mesafeParasi());
		System.out.println(
				"Yolcunun kazand��� indirim veya indirimler: " + (otobus1.indirimler() + otobus1.indirimler2()));

		System.out.println("yolcunun �deyece�i toplam tutar: " + otobus1.toplamTutar());
		otobus1.Git();

		Plane plane1 = new Plane("Ankara", "�stanbul", yas, sefer, 0.40, mesafe);
		System.out.println("Mesafe �creti:" + plane1.mesafeParasi());
		System.out
				.println("Yolcunun kazand��� indirim veya indirimler: " + (plane1.indirimler() + plane1.indirimler2()));
		System.out.println("yolcunun �deyece�i toplam tutar: " + plane1.toplamTutar());
		plane1.Git();

		Tren tren1 = new Tren("Ankara", "�stanbul", yas, sefer, 0.25, mesafe);
		System.out.println("Mesafe �creti:" + tren1.mesafeParasi());
		System.out
				.println("Yolcunun kazand��� indirim veya indirimler: " + (tren1.indirimler() + tren1.indirimler2()));
		System.out.println("yolcunun �deyece�i toplam tutar: " + tren1.toplamTutar());
		tren1.Git();
	}

}
