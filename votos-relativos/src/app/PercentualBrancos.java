package app;

public class PercentualBrancos {
	
	long totalEleitores;
	long votosBrancos;
	
	public PercentualBrancos () {
		this.votosBrancos = votosBrancos;
		this.totalEleitores = totalEleitores;
	}
	
	public void percentualBrancos(double votosBrancos, double totalEleitores) {
		
		double percentualBrancos = (votosBrancos / totalEleitores) * 100;
		
		System.out.printf("Há %.0f%s%n", percentualBrancos, "% de votos brancos.");
	}
	
}
