import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int number, horas;
		double valor, salario;
		
		number = sc.nextInt();
		horas = sc.nextInt();
		valor = sc.nextDouble();
		
		salario = valor * horas;
		
		System.out.println("NUMBER = " + number); 
		System.out.printf("SALARY = U$ %.2f", salario);
		
		
	}

}
