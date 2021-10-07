package ex1014;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double distancia = sc.nextDouble();
		double combustivel = sc.nextDouble();
		
		double medio = distancia / combustivel;
		 
		System.out.println(String.format("%.3f", medio) + " km/l");
	}

}
