package shop;

import java.util.Date;
import java.util.Hashtable;

public class Bolt {

	private String nev;
	private String cim;
	private String tulajdonos;
	private Hashtable elelmiszerpult;

	public Bolt(String nev, String cim, String tulajdonos, Hashtable elelmiszerpult) {
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
		this.elelmiszerpult = elelmiszerpult;
	}

	public Bolt(String nev, String cim, String tulajdonos) {
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
	}

	public String getNev() {
		return nev;
	}

	public String getCim() {
		return cim;
	}

	public String getTulajdonos() {
		return tulajdonos;
	}

	public boolean vanMegTej() {
		return true;
	}

	public Tej vasarolTej(Tej m) {
		Date date = new Date();
		Tej tej = new Tej(1234123, 1, "Mizo", date, 1.8);
		return tej;
	}

	public void feltoltTej(Tej m) {

	}

	private class BoltBejegyzes {

		private Tej t;
		private int mennyiseg;
		private int ar;

		BoltBejegyzes(Tej t, int mennyieg, int ar) {
			this.t = t;
			this.mennyiseg = mennyiseg;
			this.ar = ar;

		}

		public Tej getT() {
			return t;
		}

		public void setT(Tej t) {
			this.t = t;
		}

		public int getMennyiseg() {
			return mennyiseg;
		}

		public void setMennyiseg(int mennyiseg) {
			this.mennyiseg = mennyiseg;
		}

		public void adMennyiseg(int mennyiseg) {
			this.mennyiseg += mennyiseg;
		}

		public void levonMennyiseg(int mennyiseg) {
			this.mennyiseg -= mennyiseg;
		}

		public int getAr() {
			return ar;
		}

		public void setAr(int ar) {
			this.ar = ar;
		}
	}

}
