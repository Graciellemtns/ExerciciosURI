package ex1005;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double A, B;
		double media;
		
		Locale.setDefault(Locale.US);
		A = sc.nextDouble();
		B = sc.nextDouble();
		
		media = ((A * 3.5) + (B * 7.5))/11;
		
		System.out.println("MEDIA = %.5f%n" + media);
		
		sc.close();

	}

}
