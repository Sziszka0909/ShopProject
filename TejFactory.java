package shop;

import java.util.Date;

public abstract class TejFactory {

	public abstract Tej ujTartosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo,
			double zsirtartalom, long ar);

	public abstract Tej ujFeltartosTej(Long vonalKod, int urtartalom, String gyarto, Date szavatossagiIdo,
			double zsirtartalom, long ar);

}
