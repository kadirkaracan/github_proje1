
public class SuperMarketManager extends BaseMarketManager {




public SuperMarketManager(double ekmekBirimFiyat) {
		super(ekmekBirimFiyat);
		
	}

@Override
public double breadPrice(int kacEkmek) {
	
	return kacEkmek*getEkmekBirimFiyat();
}




}
