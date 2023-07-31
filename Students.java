import java.security.PublicKey;
import java.sql.PseudoColumnUsage;

import javax.print.attribute.standard.MediaSize.Other;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class Students {
	private Courses course;
	private String name;
	private String lastName;
	private double matnot;
	private double fiziknot;
	private double kimyanot;
	private int parasi;

	public Students(Courses course, String name, String lastName,  int parasi) {

		this.course = course;
		this.name = name;
		this.lastName = lastName;
		this.matnot = 0;
		this.fiziknot = 0;
		this.kimyanot = 0;
		this.parasi = parasi;
	}

	public void not(int matnot, int fiziknot, int kimyanot, Teachers teachers1, Teachers teachers2,
			Teachers teachers3) {
		if (parasi >= teachers1.getPrice() && parasi >= teachers2.getPrice() && parasi >= teachers3.getPrice()) {
			double ortalama = (matnot+fiziknot+kimyanot) / 3;
			if (matnot == 0 && fiziknot == 0 && kimyanot == 0) {
				System.out.println("notlar daha girilmemiþtir.");
			} else {
				this.matnot = matnot;
				this.fiziknot = fiziknot;
				this.kimyanot = kimyanot;

			}
			if (ortalama > 50) {
				System.out.println(this.name + " adlý öðrenci dersten " + ortalama + " ile gemiþtir");
			} else {
				System.out.println("öðrenci dersten kalmýþtýr");
			}
		} else {
			System.out.println("öðrencinin parasý yetmemiþtir.");
		}
	}

	public int getParasi() {
		return parasi;
	}

	public void setParasi(int parasi) {
		this.parasi = parasi;
	}

	public Courses getCourse() {
		return course;
	}

	public void setCourse(Courses course) {
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getMatnot() {
		return matnot;
	}

	public void setMatnot(double matnot) {
		this.matnot = matnot;
	}

	public double getFiziknot() {
		return fiziknot;
	}

	public void setFiziknot(double fiziknot) {
		this.fiziknot = fiziknot;
	}

	public double getKimyanot() {
		return kimyanot;
	}

	public void setKimyanot(double kimyanot) {
		this.kimyanot = kimyanot;
	}

	
	
	


}
