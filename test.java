
public class test {

	public static void main(String[] args) {
		Akademisyen akademisyen1 = new Akademisyen("Engin Demiro�", "985984388", "Engindem.@gmail.com",
				"Bilgisayar M�hendisli�i", "Profesor");
		akademisyen1.derseGir("12.00");

		OgretimGorevlisi ogretimGorevlisi = new OgretimGorevlisi("Onur �ak�rg�z", "123123123", "patikaDEv@gmail.com",
				"Bilgisayar M�hendisli�i", "Do�ent");
		ogretimGorevlisi.senatoToplanti("14.00");
		ogretimGorevlisi.derseGir("09.00");
		Asistan asistan1 = new Asistan("ela", "123435", "kodluyoruz@gmail.com", "Bilgisayar M�hendisli�i",
				"Ara�t�rma G�revlisi", "14.00");
		asistan1.cikis("18.00");
		asistan1.quizYap();
		LabASistani lab1=new LabASistani("Bayram D�ndar", "57487439", "bDundar@gmail.com", "Bilgisayar m�hendisli�i", "ara�t�rma g�revlisi","13.00");
		lab1.lablaraGir("15.00");
		Bilgi�slem memur1=new Bilgi�slem("engin", "83923", "irfankllk@gmail.com", "Bilgi ��lem", "10.00-19.00");
		memur1.networkKurulum();
		GuvenlikGorevlisi memur2=new GuvenlikGorevlisi("adem", "58300", "adem@gmail.com", "k�t�phane", "08.00-16.00");
		memur2.nobet();
	}

}
