package shop;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date date = new Date(117, 2, 15);
		Tej tej = new Tej(1, "Mizo", date, 1.7, 200);
		System.out.println(tej);
	}

}
