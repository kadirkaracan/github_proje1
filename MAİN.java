

public class MA�N {

	public static void main(String[] args) {
		
		String[] referans= {"Kerim Karacan", "�a�la �lker"};
		       System.out.println("Yurtd��� ��k�� sistemine ho�geldiniz");
		System.out.println("----------------------------------------");
        System.out.println("Yurtd���na ��kmak i�in gerekli olan �artlar �unlard�r:" );
        String mesaj= " Vize durumunuzun tamamlanm�� olmas� gerekir \n+"
        		+ " Yurtd��� har� i�lemlerinin tamamlanm�� olmas� gerekir \n"
        		+ "Yabanc� dil S�nav�ndan ge�mi� olman�z gerekir \n"
        		+ "Siyasi yasa��n�z�n bulunmamas� gerekir. \n";
        	
        int hak=3;
      
        while(hak!=0){
   System.out.println(mesaj);
        	
        	Yolcu yolcu=new Yolcu();
      IYurtDisiCikis �yuCikis=new CikisSartlari(yolcu);
      
      �yuCikis.referansDurumu(referans);
      if (�yuCikis.harcUcreti()==true && �yuCikis.siyasiYasak()==false && �yuCikis.vizeDurumu()==true && �yuCikis.yabanc�DilDurumu()==true ) {
		System.out.println("Yolcu yurtd���na ��kmaya hak kazanm��t�r");
		break;
	
	}
       
		
	
      else {
		System.out.println("Yolcu bu �artlar� kar��lamadan yurtd���na ��kamaz ");
		hak-=1;
		System.out.println("Kalan hakk�n�z: " + hak);
		continue;
	}
       
        
        
        }
      
	}

}
