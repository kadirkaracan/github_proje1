
public class KazananBoksor {

	public void kazanan(Boksorler boksor1,Boksorler boksor2) {
		if (boksor1.getPuan()>boksor2.getPuan()) {
			System.out.println(boksor1.getName()+" adl� boks�r ma�� kazanm��t�r" 
		+ "puan�: "+ boksor1.getPuan());
			
			
		}
		else {
			System.out.println(boksor2.getName()+" adl� boks�r ma�� kazanm��t�r" 
					+ "puan�: "+ boksor2.getPuan());
		}
		System.out.println("boks�rlerin puanlar�--------"
				+ " boks�r1: "+ boksor1.getPuan() +
				" --boks�r2: " + boksor2.getPuan());
	}
}
