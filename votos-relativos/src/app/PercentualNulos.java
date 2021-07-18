package app;

public class PercentualNulos {
	
	long totalEleitores;
	long votosNulos;
	
	public PercentualNulos () {
		this.votosNulos = votosNulos;
		this.totalEleitores = totalEleitores;
	}
	
	public void percentuaNulos(double votosNulos, double totalEleitores) {
		
		double percentuaNulos = (votosNulos / totalEleitores) * 100;
		
		System.out.printf("Há %.0f%s%n", percentuaNulos, "% de votos nulos.");
	}

}
