package ex1010;

import java.util.Locale;
import java.util.Scanner;

public class ex1010 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int cdPeca1, qtda1,cdPeca2, qtda2;
		double vUnitario1, vTotal, vUnitario2;
		
		cdPeca1 = sc.nextInt();
		qtda1 = sc.nextInt();
		vUnitario1 = sc.nextDouble();
		
		cdPeca2 = sc.nextInt();
		qtda2 = sc.nextInt();
		vUnitario2 = sc.nextDouble();
		
		vTotal = (qtda1 * vUnitario1) + (qtda2 * vUnitario2);
	
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", vTotal);
	}

}
