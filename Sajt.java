package shop;

import java.util.Date;

public class Sajt extends Elelmiszer {

	protected double suly;
	protected double zsirtartalom;
	protected Long vonalKod;
	protected String gyarto;
	protected Date szavatossagiIdo;

	public Sajt(Long vonalKod, double suly, String gyarto, Date szavatossagiIdo, double zsirtartalom) {
		super(vonalKod, gyarto, szavatossagiIdo);
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

	@Override
	public boolean joMeg() {
		Date date = new Date();
		long ma = date.getTime();
		if (new Date(ma).after(szavatossagiIdo)) {
			return false;
		}
		return true;
	}

	@Override
	public Long getVonalKod() {
		return vonalKod;
	}

	@Override
	public String getGyarto() {
		return gyarto;
	}

	@Override
	public Date getSzavatossagiIdo() {
		return szavatossagiIdo;
	}

}
