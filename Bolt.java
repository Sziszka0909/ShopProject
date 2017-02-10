package shop;

import java.util.Date;

public class Bolt {

	private String nev;
	private String cim;
	private String tulajdonos;
	private Tej[] tejpult;
	private int flag;

	public Bolt(String nev, String cim, String tulajdonos, Tej[] tejpult) {
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
		this.tejpult = tejpult;
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
		Date date = new Date(117, 2, 15);
		Tej tej = new Tej(1, "Mizo", date, 1.7, 200);
		return tej;
	}

}
