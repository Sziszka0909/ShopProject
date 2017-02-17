package shop;

import java.util.Date;

public class Sajt {

	protected double suly;
	protected double zsirtartalom;
	protected Long vonalKod;
	protected String gyarto;
	protected Date szavatossagiIdo;

	public Sajt(Long vonalKod, double suly, String gyarto, Date szavatossagiIdo, double zsirtartalom) {
		this.vonalKod = vonalKod;
		this.suly = suly;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossagiIdo;
		this.zsirtartalom = zsirtartalom;
	}

	public double getSuly() {
		return suly;
	}

	public double getZsirtartalom() {
		return zsirtartalom;
	}

	@Override
	public String toString() {
		return "Súly: " + suly + ". Zsírtartalom: " + zsirtartalom + ". Vonalkód: " + vonalKod + ". Gyártó: " + gyarto
				+ ". Szavatossági idő: " + szavatossagiIdo;
	}

	public boolean joMeg() {
		Date date = new Date();
		long ma = date.getTime();
		if (new Date(ma).after(szavatossagiIdo)) {
			return false;
		}
		return true;
	}

	public Long getVonalKod() {
		return vonalKod;
	}

	public String getGyarto() {
		return gyarto;
	}

	public Date getSzavatossagiIdo() {
		return szavatossagiIdo;
	}

}
