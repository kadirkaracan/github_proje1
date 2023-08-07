import java.util.Scanner;



public class CustomerManager {
 //private BaseMarketManager market;

/*public CustomerManager(BaseMarketManager market) {
	
	this.market = market;
}*/
	/* public BaseMarketManager getMarket() {
	return market;
}

public void setMarket(BaseMarketManager market) {
	this.market = market;
}*/

	
	BaseMarketManager market;
Scanner scanner=new Scanner(System.in);

public void ekmekAl() {
	System.out.println("Kaç tane ekmek istersiniz?");
	int a=scanner.nextInt();
	System.out.println("Alacağınız ekmek sayısı: " + market.breadPrice(a)/market.getEkmekBirimFiyat());
	System.out.println("Ödeyeceğiniz tutar: " + market.breadPrice(a));
}

public BaseMarketManager getMarket() {
	return market;
}

public void setMarket(BaseMarketManager market) {
	this.market = market;
}




}
