import java.util.Scanner;

public class Votacao{
	public static void main(String [] args){
		double tEleitores, nrVotoValidos, nrVotosNulos;
                double pEleitores, pVotosValidos, pVotosNulos;

		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o numero total de eleitores: ");
		tEleitores = scan.nextDouble();
		System.out.print("Informe o numero de votos validos: ");
		nrVotoValidos = scan.nextDouble();
		System.out.print("Informe o numero de votos nulos: ");
		nrVotosNulos= scan.nextDouble();


		pEleitores = 100;
		pVotosNulos = (nrVotosNulos/tEleitores)*100;
		pVotosValidos = (nrVotoValidos/tEleitores)*100;
	
		System.out.println("Percentagem de eleitores: "+pEleitores+" %");
		System.out.println("Percentagem de votos nulos: "+pVotosNulos+" %");
		System.out.println("Percentagem de votos validos: "+pVotosValidos+" %");
	}
}