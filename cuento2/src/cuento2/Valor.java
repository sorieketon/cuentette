package cuento2;

import java.util.Scanner;


public class Valor {
	public static int leervalor() {
		int valor = 0;
		Scanner sc = new Scanner(System.in);
		valor = sc.nextInt();
		if(valor!=1 && valor!=2 && valor!=3){
						throw new NumeroNoUtil();
		}
		return valor;
		
	}

}
