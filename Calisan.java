
public class Calisan {
private String name;
private double maas;
private int calismaSaati;
private int baslamaYili;

public Calisan(String name,double maas, int calismaSaati,int baslamaYili) {
	this.name=name;
	this.maas=maas;
	this.calismaSaati=calismaSaati;
	this.baslamaYili=baslamaYili;
	
}
public double Vergi() {
	if (this.maas<1000) {
	return 0;	
	}
	else {
		return (this.maas*3)/100;
	}
	
}
public double Bonus() {
	if (this.calismaSaati>40) {
		return (this.calismaSaati-40)*30;
	}
	else {
		return 0;
	}
}
public double Zam() {
	if (2021-this.baslamaYili<10) {
		return (this.maas*5)/100;
	}
	else if (2021-this.baslamaYili>9 && 2021-this.baslamaYili<20) {
		return (this.maas*10)/100;
	}
	else   {
		return (this.maas*15)/100;
	}
}

public void bilgileriYazdir() {
	System.out.println("çalýþanýn adý: " + this.name);
	System.out.println("çalýþanýn maaþý: " + this.maas);
	System.out.println("çalýþma saati: " + this.calismaSaati);
	System.out.println("çalýþanýn baþlangýç yýlý: " + this.baslamaYili);
	System.out.println("çalýþanýn ödediði vergi: " + Vergi());
	System.out.println("çalýþanýn bonusu: " + Bonus());
	System.out.println("çalýþanýn zammý: " + Zam());
	System.out.println("çalýþanýn vergi ve bonus ile maaþý: " +(this.maas+ (Bonus()- Vergi())));
	System.out.println("çalýþanýn zamla birlikte maaþý: " + (this.maas+Zam()));
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getMaas() {
	return maas;
}

public void setMaas(double maas) {
	this.maas = maas;
}

public int getCalismaSaati() {
	return calismaSaati;
}

public void setCalismaSaati(int calismaSaati) {
	this.calismaSaati = calismaSaati;
}

public int getBaslamaYili() {
	return baslamaYili;
}

public void setBaslamaYili(int baslamaYili) {
	this.baslamaYili = baslamaYili;
}

}
