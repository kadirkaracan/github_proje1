
public class KazananBoksor {

	public void kazanan(Boksorler boksor1,Boksorler boksor2) {
		if (boksor1.getPuan()>boksor2.getPuan()) {
			System.out.println(boksor1.getName()+" adlý boksör maçý kazanmýþtýr" 
		+ "puaný: "+ boksor1.getPuan());
			
			
		}
		else {
			System.out.println(boksor2.getName()+" adlý boksör maçý kazanmýþtýr" 
					+ "puaný: "+ boksor2.getPuan());
		}
		System.out.println("boksörlerin puanlarý--------"
				+ " boksör1: "+ boksor1.getPuan() +
				" --boksör2: " + boksor2.getPuan());
	}
}
