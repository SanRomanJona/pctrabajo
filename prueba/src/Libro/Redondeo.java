package Libro;

import java.util.Locale;
import java.util.Scanner;

public class Redondeo {

	public static void main(String[] args) {
		
		double n; //aqui guardamos el numero decimal introducido por el usuario.
		int redondeo; //utilizamos esta variable para truncar los decimales
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);//en lugar de coma utiliza punto para los decimales
		
		System.out.println("Escriba un numero decimal (con punto): ");
		n = sc.nextDouble();
		
		
	}

}
