
public class main {

	public static void main(String[] args) {
	/*	CustomerManager customer1=new CustomerManager(new SuperMarketManager(0.50));
		customer1.ekmekAl();   */
		
		
// Bu �rnek Bir Abstract s�n�f �rne�idir. Bu �ekilde de kullan�labilir yada a�a��daki gibi bir kullan�m� da vard�r aralar�ndaki fark
// CustomerManager S�n�f�nda market de�i�keninin private veya public olmas�d�r. private olursa yukar�daki gibi bir kullan�m� olur.
// public olursa a�a��daki gibidir... 
		
		CustomerManager customer1=new CustomerManager();
		customer1.market=new SuperMarketManager(1.2);
		customer1.ekmekAl();
	}

}
