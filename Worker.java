// Bizim �irket �al��an�m�z
public class Worker implements IWorkable,IEatable,IPayable{

	@Override
	public void pay() {
		System.out.println("Maa� �dendi.");
		
	}

	@Override
	public void eat() {
		
		System.out.println("Yemek yendi..");
	}

	@Override
	public void work() {
		System.out.println("mesai saatlerinde �al���ld�");
		
	}

}
