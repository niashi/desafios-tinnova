package app;

public class App {
	
	public static void main(String[] args) {

		// Cria��o de inst�ncias das classes preexistentes
		PercentualValidos validos = new PercentualValidos();
		PercentualBrancos brancos = new PercentualBrancos();
		PercentualNulos nulos = new PercentualNulos();
		
		// Chamando m�todos das inst�ncias criadas e passando argumentos
		validos.percentualValidos(800, 1000);
		brancos.percentualBrancos(150, 1000);
		nulos.percentuaNulos(50, 1000);
	}
	
}
