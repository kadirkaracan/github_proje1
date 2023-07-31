
public class test {

	public static void main(String[] args) {
		Akademisyen akademisyen1 = new Akademisyen("Engin Demiroð", "985984388", "Engindem.@gmail.com",
				"Bilgisayar Mühendisliði", "Profesor");
		akademisyen1.derseGir("12.00");

		OgretimGorevlisi ogretimGorevlisi = new OgretimGorevlisi("Onur ÇakýrgÖz", "123123123", "patikaDEv@gmail.com",
				"Bilgisayar Mühendisliði", "Doçent");
		ogretimGorevlisi.senatoToplanti("14.00");
		ogretimGorevlisi.derseGir("09.00");
		Asistan asistan1 = new Asistan("ela", "123435", "kodluyoruz@gmail.com", "Bilgisayar Mühendisliði",
				"Araþtýrma Görevlisi", "14.00");
		asistan1.cikis("18.00");
		asistan1.quizYap();
		LabASistani lab1=new LabASistani("Bayram Dündar", "57487439", "bDundar@gmail.com", "Bilgisayar mühendisliði", "araþtýrma görevlisi","13.00");
		lab1.lablaraGir("15.00");
		BilgiÝslem memur1=new BilgiÝslem("engin", "83923", "irfankllk@gmail.com", "Bilgi Ýþlem", "10.00-19.00");
		memur1.networkKurulum();
		GuvenlikGorevlisi memur2=new GuvenlikGorevlisi("adem", "58300", "adem@gmail.com", "kütüphane", "08.00-16.00");
		memur2.nobet();
	}

}
