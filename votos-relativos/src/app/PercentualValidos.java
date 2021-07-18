package app;

public class PercentualValidos {
	
	public double totalEleitores;
	public double votosValidos;
	
	public PercentualValidos () {
		this.votosValidos = votosValidos;
		this.totalEleitores = totalEleitores;
	}

	public void percentualValidos(double votosValidos, double totalEleitores) {
		
		double percentualValidos = (votosValidos / totalEleitores) * 100;
		
		System.out.printf("Há %.0f%s%n", percentualValidos, "% de votos válidos.");
	}

}

