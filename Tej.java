package shop;

import java.util.Date;

public abstract class Tej extends Elelmiszer {

	public Long vonalKod;
	public final int LITER;
	public final int FELLITER;
	public final int POHAR;
	public final double ZSIROS;
	public final double FELZSIROS;
	protected int urtartalom;
	protected String gyarto;
	protected Date szavatossagiIdo;
	protected double zsirtartalom;

	public Tej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo, double zsirtartalom) {
		super(vonalKod, gyarto, szavatossagiIdo);
		this.urtartalom = urtartalom;
		this.zsirtartalom = zsirtartalom;
		if (urtartalom == 1) {
			this.LITER = urtartalom;
		} else if (urtartalom == 0.5) {
			this.FELLITER = urtartalom;
		} else if (urtartalom == 0.3) {
			this.POHAR = urtartalom;
		}
		if (zsirtartalom == 1.8) {
			this.FELZSIROS = zsirtartalom;
		} else if (zsirtartalom == 3.2) {
			this.ZSIROS = zsirtartalom;
		}

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

	public int getUrtartalom() {
		return urtartalom;
	}

	@Override
	public String getGyarto() {
		return gyarto;
	}

	@Override
	public Date getSzavatossagiIdo() {
		return szavatossagiIdo;
	}

	public double getZsirtartalom() {
		return zsirtartalom;
	}

	@Override
	public String toString() {
		return "Űrtartalom: " + urtartalom + ". Gyártó: " + gyarto + ". Szavatossági idő: " + szavatossagiIdo
				+ ". Zsírtartalom: " + zsirtartalom;
	}

}