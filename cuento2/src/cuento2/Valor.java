package cuento2;

import java.util.Scanner;


public class Valor {
	public static String leervalor() {
		String valor = " ";
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		valor = sc.nextLine();
		return valor;
	}

}
