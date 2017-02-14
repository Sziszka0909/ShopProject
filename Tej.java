package shop;

import java.util.Date;

public class Tej {

	public long vonalKod;
	public final int LITER;
	public final int FELLITER;
	public final int POHAR;
	public final double ZSIROS;
	public final double FELZSIROS;
	protected int urtartalom;
	protected String gyarto;
	protected Date szavatossagiIdo;
	protected double zsirtartalom;
	protected long ar;

	public Tej(int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom, long ar) {
		this.urtartalom = urtartalom;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossagiIdo;
		this.zsirtartalom = zsirtartalom;
		this.ar = ar;
	}

	public boolean joMeg() {
		Date date = new Date();
		long ma = date.getTime();
		if (new Date(ma).after(szavatossagiIdo)) {
			return false;
		}
		return true;

	}

	public int getUrtartalom() {
		return urtartalom;
	}

	public String getGyarto() {
		return gyarto;
	}

	public Date getSzavatossagiIdo() {
		return szavatossagiIdo;
	}

	public double getZsirtartalom() {
		return zsirtartalom;
	}

	public long getAr() {
		return ar;
	}

	@Override
	public String toString() {
		return "Űrtartalom: " + urtartalom + " Gyártó: " + gyarto + " Szavatossági idő: " + szavatossagiIdo
				+ " Zsírtartalom: " + zsirtartalom + " Ár: " + ar;
	}

	private class BoltBejegyzes {

		private Tej t;
		private int mennyiseg;
		private int ar;

		public BoltBejegyzes(Tej t, int mennyieg, int ar) {
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