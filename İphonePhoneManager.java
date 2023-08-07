
public class ÝphonePhoneManager extends BasePhoneManager{

	public ÝphonePhoneManager(String phone_Brand, String phone_Model) {
		super(phone_Brand, phone_Model);
		
	}

	@Override
	public double buy_Phone(int phone_Prices, double otv) {
		
		return (phone_Prices + (phone_Prices*0.18 + phone_Prices*0.10 + phone_Prices * 0.01) + (phone_Prices*otv) + (phone_Prices*0.20));
	}

}
