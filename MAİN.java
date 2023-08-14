

public class MAÝN {

	public static void main(String[] args) {
		
		String[] referans= {"Kerim Karacan", "Çaðla Ülker"};
		       System.out.println("Yurtdýþý çýkýþ sistemine hoþgeldiniz");
		System.out.println("----------------------------------------");
        System.out.println("Yurtdýþýna çýkmak için gerekli olan þartlar þunlardýr:" );
        String mesaj= " Vize durumunuzun tamamlanmýþ olmasý gerekir \n+"
        		+ " Yurtdýþý harç iþlemlerinin tamamlanmýþ olmasý gerekir \n"
        		+ "Yabancý dil Sýnavýndan geçmiþ olmanýz gerekir \n"
        		+ "Siyasi yasaðýnýzýn bulunmamasý gerekir. \n";
        	
        int hak=3;
      
        while(hak!=0){
   System.out.println(mesaj);
        	
        	Yolcu yolcu=new Yolcu();
      IYurtDisiCikis ýyuCikis=new CikisSartlari(yolcu);
      
      ýyuCikis.referansDurumu(referans);
      if (ýyuCikis.harcUcreti()==true && ýyuCikis.siyasiYasak()==false && ýyuCikis.vizeDurumu()==true && ýyuCikis.yabancýDilDurumu()==true ) {
		System.out.println("Yolcu yurtdýþýna çýkmaya hak kazanmýþtýr");
		break;
	
	}
       
		
	
      else {
		System.out.println("Yolcu bu þartlarý karþýlamadan yurtdýþýna çýkamaz ");
		hak-=1;
		System.out.println("Kalan hakkýnýz: " + hak);
		continue;
	}
       
        
        
        }
      
	}

}
