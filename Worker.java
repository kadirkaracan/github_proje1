// Bizim Þirket Çalýþanýmýz
public class Worker implements IWorkable,IEatable,IPayable{

	@Override
	public void pay() {
		System.out.println("Maaþ Ödendi.");
		
	}

	@Override
	public void eat() {
		
		System.out.println("Yemek yendi..");
	}

	@Override
	public void work() {
		System.out.println("mesai saatlerinde çalýþýldý");
		
	}

}
