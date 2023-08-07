
public abstract class BasePhoneManager {
private String phone_Brand;
private String phone_Model;




public BasePhoneManager(String phone_Brand, String phone_Model) {
	
	this.phone_Brand = phone_Brand;
	this.phone_Model = phone_Model;
}

public abstract double buy_Phone(int phone_Prices, double otv);

public String getPhone_Brand() {
	return phone_Brand;
}

public void setPhone_Brand(String phone_Brand) {
	this.phone_Brand = phone_Brand;
}

public String getPhone_Model() {
	return phone_Model;
}

public void setPhone_Model(String phone_Model) {
	this.phone_Model = phone_Model;
}


}
