
public class main {

	public static void main(String[] args) {
	/*	CustomerManager customer1=new CustomerManager(new SuperMarketManager(0.50));
		customer1.ekmekAl();   */
		
		
// Bu Örnek Bir Abstract sınıf Örneğidir. Bu Şekilde de kullanılabilir yada aşağıdaki gibi bir kullanımı da vardır aralarındaki fark
// CustomerManager Sınıfında market değişkeninin private veya public olmasıdır. private olursa yukarıdaki gibi bir kullanımı olur.
// public olursa aşağıdaki gibidir... 
		
		CustomerManager customer1=new CustomerManager();
		customer1.market=new SuperMarketManager(1.2);
		customer1.ekmekAl();
	}

}
