

public class CikisSartlari  implements IYurtDisiCikis {

	private Yolcu yolcu;
	
	
	
	
	public CikisSartlari(Yolcu yolcu) {
		
		this.yolcu = yolcu;
		
	}

	@Override
	public boolean vizeDurumu() {
	 if (yolcu.getVize()==true) {
		
		return true;
	}

	 return false;
	}

	@Override
	public boolean harcUcreti() {
		if (yolcu.getHarcUcreti() >=1500) {
			System.out.println(yolcu.getName() + " nin yeterli miktarda harç parası vardır.");
			return true;
		}
		else {
			System.out.println(yolcu.getName() + " nin yeterli miktarda harç parası yoktur.");
			return false;
		}
	}

	@Override
	public void referansDurumu(String[] array) {
		if (yolcu.getReferans()==true) {
			for (int i = 0; i < array.length; i++) {
				System.out.println( "  yolcunun referansları: " + array[i]) ;
			}
			
		}
		else {
			System.out.println(yolcu.getName() + " nin referansları yoktur.");
			
		}
	}

	@Override
	public boolean yabancıDilDurumu() {
		if (yolcu.getYabanciDil()==true) {
		
			return true;
		}
		else {
			
			return false;
		}
		
	}

	@Override
	public boolean siyasiYasak() {
		if (yolcu.getSiyasiYasak()==true) {
			
			return true;
		}
		else {
			
			return false;
		}
	}

	

	
}
