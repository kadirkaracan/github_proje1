import java.util.Scanner;

public class MAÝN {

	public static void main(String[] args) {
		System.out.println("Sisteme hoþgeldiniz...");
		
		String islemler= " Yapabileceðiniz iþlemler aþaðýdaki gibidir\n"
				+ "1- q ya basarak programdan çýkýþ yapabilirsiniz...\n"
				+ "2- Dairenin alanýný hesaplamak için 1'e basýnýz...\n"
				+ "3- Üçgenin çevresini hesaplamak için 2'ye basýnýz...\n"
				+ "4- Vektör çarpýmýný hesaplamak istiyorsanýz 3'e basýnýz...";
		
		while (true) {
			System.out.println(islemler);
			Scanner scanner=new Scanner(System.in);
			System.out.print("Hangi tuþa basmak istersiniz?");
			String islem=scanner.nextLine();
			if (islem.equals("q")) {
				System.out.println("Programdan çýkýlýyor");
				break;
			}
			else if (islem.equals("1")) {
				System.out.print("Dairenin yarýçapýný giriniz: ");
				int yariCap=scanner.nextInt();
				Problems.Matematik.daireAlan(yariCap);
				
			}
			else if (islem.equals("2")) {
				Problems.Matematik.ucgenCevresi();
			}
			else if (islem.equals("3")) {
				Vectors vec1=new Vectors();
				Vectors vec2=new Vectors();
				Problems.Fizik.vectorCarpim(vec1, vec2);
			}
			else {
				System.out.println("Geçersiz iþlem...");
			}
		}

	}

}
