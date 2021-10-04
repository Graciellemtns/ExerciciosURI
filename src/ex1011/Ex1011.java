package ex1011;

import java.util.Locale;
import java.util.Scanner;

public class Ex1011 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, volume;
		
		raio = sc.nextDouble();
		
		volume = (4/3.0) * 3.14159 * raio * raio * raio;
		
		System.out.printf("VOLUME = %.3f%n", volume);
	}

}
