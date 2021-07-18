package app;

import java.util.Scanner;

public class SomaMultiplos {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Por favor, insira um n�mero para saber a soma dos m�ltiplos de 3 ou de 5 at� o n�mero em quest�o: ");
		
		int numero = scan.nextInt();
		
		System.out.println();
		
		System.out.printf("A soma � %d.", somaMultiplos(numero));
	}
	
	// Realiza a soma dos valores a partir do n�mero disponibilizado pelo usu�rio
	public static int somaMultiplos(int numero) {
		
		int multiplos3 = 0;
		int multiplos5 = 0;
		
		for (int i = 1; i < numero; i++) {
			if (i % 3 == 0) {
				multiplos3 += i;
			} else if (i % 5 == 0) {
				multiplos5 += i;
			}
		}
		
		return (multiplos3 + multiplos5);
	}
}
