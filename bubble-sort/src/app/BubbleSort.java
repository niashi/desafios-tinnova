package app;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		// Esta array pode ser alterada para que se realizem outros testes
		int[] arr = {5, 3, 2, 4, 7, 1, 0, 6};
		int x;	
		
		// Algoritmo que realiza o Bubble Sort
		for (int i = 0; i < (arr.length - 1); i++) {
			for(int j = 0; j < (arr.length - 1); j++) {
				if (arr[j] > arr[j+1]) {	
					x = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = x;
				}
			}
		}
		
		// Algoritmo que mostra a nova array ordenada
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+ arr[i]);
		}
	}
}
