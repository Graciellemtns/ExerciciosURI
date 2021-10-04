package ex1009;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		String nome;	
		double sFixo, venda, sTotal;
		
		nome = sc.next();
		sFixo = sc.nextDouble();
		venda = sc.nextDouble();
		
		sTotal = sFixo + (venda * 0.15);
		
		
		System.out.printf("TOTAL = R$ %.2f%n", sTotal);
		
		
		
	}

}
