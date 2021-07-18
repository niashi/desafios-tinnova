package app;

public class App {
	
	public static void main(String[] args) {

		// Criação de instâncias das classes preexistentes
		PercentualValidos validos = new PercentualValidos();
		PercentualBrancos brancos = new PercentualBrancos();
		PercentualNulos nulos = new PercentualNulos();
		
		// Chamando métodos das instâncias criadas e passando argumentos
		validos.percentualValidos(800, 1000);
		brancos.percentualBrancos(150, 1000);
		nulos.percentuaNulos(50, 1000);
	}
	
}
