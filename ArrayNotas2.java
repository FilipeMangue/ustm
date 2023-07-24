import java.util.Scanner;

public class ArrayNotas2{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe a quantidade de notas: ");
		int qtd = scan.nextInt();
		double[] notas = new double[qtd];
		double somMedia = 0;

		for(int i = 0; i < qtd; i++){
			System.out.print("Digite a nota "+i+": ");
			notas[i] = scan.nextDouble();
			somMedia += notas[i];
		}

		double media = somMedia/qtd;

		System.out.println(media);
	}
}