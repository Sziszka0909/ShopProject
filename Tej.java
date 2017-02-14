package shop;

import java.util.Date;

public abstract class Tej {

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

	public Tej(long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom) {
		this.vonalKod = vonalKod;
		this.urtartalom = urtartalom;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossagiIdo;
		this.zsirtartalom = zsirtartalom;
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

	@Override
	public String toString() {
		return "Űrtartalom: " + urtartalom + " Gyártó: " + gyarto + " Szavatossági idő: " + szavatossagiIdo
				+ " Zsírtartalom: " + zsirtartalom;
	}

}