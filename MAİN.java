import java.util.Scanner;

public class MA�N {

	public static void main(String[] args) {
		System.out.println("Sisteme ho�geldiniz...");
		
		String islemler= " Yapabilece�iniz i�lemler a�a��daki gibidir\n"
				+ "1- q ya basarak programdan ��k�� yapabilirsiniz...\n"
				+ "2- Dairenin alan�n� hesaplamak i�in 1'e bas�n�z...\n"
				+ "3- ��genin �evresini hesaplamak i�in 2'ye bas�n�z...\n"
				+ "4- Vekt�r �arp�m�n� hesaplamak istiyorsan�z 3'e bas�n�z...";
		
		while (true) {
			System.out.println(islemler);
			Scanner scanner=new Scanner(System.in);
			System.out.print("Hangi tu�a basmak istersiniz?");
			String islem=scanner.nextLine();
			if (islem.equals("q")) {
				System.out.println("Programdan ��k�l�yor");
				break;
			}
			else if (islem.equals("1")) {
				System.out.print("Dairenin yar��ap�n� giriniz: ");
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
				System.out.println("Ge�ersiz i�lem...");
			}
		}

	}

}
