

public class NormalMarketManager extends BaseMarketManager {

	public NormalMarketManager(double ekmekBirimFiyat) {
		super(ekmekBirimFiyat);
		
	}

	@Override
	public double breadPrice(int kacEkmek) {
		
		return kacEkmek*getEkmekBirimFiyat();
	}




}
