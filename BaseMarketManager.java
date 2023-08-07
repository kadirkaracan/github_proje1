

public abstract class BaseMarketManager {
	private double ekmekBirimFiyat;



	



	public BaseMarketManager(double ekmekBirimFiyat) {
		
		this.ekmekBirimFiyat = ekmekBirimFiyat;
	}
	
public abstract double  breadPrice (int kacEkmek) ;

public double getEkmekBirimFiyat() {
	return ekmekBirimFiyat;
}

public void setEkmekBirimFiyat(double ekmekBirimFiyat) {
	this.ekmekBirimFiyat = ekmekBirimFiyat;
}

















}
