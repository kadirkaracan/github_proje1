import java.util.Scanner;

public class Problems {

	public static class Matematik{
		public static void daireAlan(int yaricap) {
			double alan=Math.PI*yaricap*yaricap;
			System.out.println("DAirenin alaný = " + alan);
		}
	public static void ucgenCevresi() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Lütfen üçgenin birinci kenar uzunluðunu giriniz : ");
		int kenar1=scanner.nextInt();
		System.out.println("Lütfen üçgenin ikinci kenar uzunluðunu giriniz : ");
		int kenar2=scanner.nextInt();
		System.out.println("Lütfen üçgenin üçüncü kenar uzunluðunu giriniz : ");
		int kenar3=scanner.nextInt();
		int ucgenCevre=(kenar1+kenar2+kenar3);
		System.out.println("Üçgenin hesaplanan çevresi= " + ucgenCevre);
	}
	
	}
	public static class Fizik{
		public static void vectorCarpim( Vectors vec1 , Vectors vec2) {
			int vectorCarpim=(vec1.getI()*vec2.getI()+vec1.getJ()*vec2.getJ()+vec1.getK()*vec2.getK());
			System.out.println(vec1.getIsim() + " ile " + vec2.getIsim()  + " vektörlerinin hesaplanan çarpýmý=  " + vectorCarpim);
		}
	}
	
	
}
