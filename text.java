import java.util.Scanner;
import java.util.function.IntBinaryOperator;

public class text {

	public static void main(String[] args) {
		// Bir yolcunun iki þehir arasýnda hangi yolculuk tipiyle
		//gittiðinde (otobüs,uçak,tren) ne kadar para ödeyeceði proglamlanmýþtýr.

		Scanner scanner = new Scanner(System.in);
		System.out.println("Mesafeyi km türünden giriniz: ");
		double mesafe = scanner.nextDouble();
		System.out.println("Lütfen yaþýnýzý giriniz: ");
		int yas = scanner.nextInt();
		System.out.println("Sefer sayýsýný giriniz: ");
		int sefer = scanner.nextInt();

		Otobus otobus1 = new Otobus("Ankara", "Ýstanbul", yas, sefer, 0.10, mesafe);
		System.out.println("Mesafe Ücreti:" + otobus1.mesafeParasi());
		System.out.println(
				"Yolcunun kazandýðý indirim veya indirimler: " + (otobus1.indirimler() + otobus1.indirimler2()));

		System.out.println("yolcunun ödeyeceði toplam tutar: " + otobus1.toplamTutar());
		otobus1.Git();

		Plane plane1 = new Plane("Ankara", "Ýstanbul", yas, sefer, 0.40, mesafe);
		System.out.println("Mesafe Ücreti:" + plane1.mesafeParasi());
		System.out
				.println("Yolcunun kazandýðý indirim veya indirimler: " + (plane1.indirimler() + plane1.indirimler2()));
		System.out.println("yolcunun ödeyeceði toplam tutar: " + plane1.toplamTutar());
		plane1.Git();

		Tren tren1 = new Tren("Ankara", "Ýstanbul", yas, sefer, 0.25, mesafe);
		System.out.println("Mesafe Ücreti:" + tren1.mesafeParasi());
		System.out
				.println("Yolcunun kazandýðý indirim veya indirimler: " + (tren1.indirimler() + tren1.indirimler2()));
		System.out.println("yolcunun ödeyeceði toplam tutar: " + tren1.toplamTutar());
		tren1.Git();
	}

}
