package ex1002;

//import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);

		
		double raio;
		double area;
	
		raio = sc.nextDouble();
		
		area = raio * raio * 3.14159;
		
		//DecimalFormat df = new DecimalFormat(".####");
		
		System.out.printf("A =  %.4f\n",  area);

	}

}
