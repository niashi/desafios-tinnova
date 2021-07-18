package app;

import java.util.Scanner;

public class Fatorial {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Por favor, insira um número natural para saber seu fatorial: ");
		
		long numero = scan.nextLong();
		
		System.out.println();
		
		System.out.printf("%d! = %d", numero, fatorial(numero));
		
	}
	
	// Realiza o fatorial do valor disponibilizado pelo usuário
	public static long fatorial(long numero) {
		if (numero == 0 || numero == 1) {
			return 1;
		}
		return ((numero * fatorial(numero - 1)));
	}
}
